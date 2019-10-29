package com.lti.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.lti.beans.Bank;
import com.lti.beans.Income;
import com.lti.beans.Loan;
import com.lti.beans.Property;
import com.lti.beans.User;
import com.lti.exceptions.UserException;
import com.lti.services.UserServices;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

@Controller
@SessionAttributes({ "username" , "EMI"})
public class Controllers {

	@Resource
	private UserServices userService;

	@Autowired
	private JavaMailSender mailSender;

	AnnotationConfigApplicationContext userctx = new AnnotationConfigApplicationContext(User.class);

	@RequestMapping("/forgotPassword")
	public String resetRequest() {
		User user = userctx.getBean(User.class, "user");
		String email = "purva.surve@lntinfotech.com";
		user.setEmail(email);
		// creating message
		String view = "changeRequest";
		if (user != null) {
			SimpleMailMessage simpleMessage = new SimpleMailMessage();
			simpleMessage.setFrom("donotreply@gmail.com");
			simpleMessage.setTo(email);
			simpleMessage.setSubject("Password Reset..");
			simpleMessage.setText("Link =  http://localhost:9080/maven-dwellfunded/spring/forgotPassword" + "\n"
					+ "Click Above Link to Reset Password");

			// simpleMessage.setText("Link =
			// http://localhost:9080/maven-dwellfunded/spring/forgotPassword");
			// sending message

			mailSender.send(simpleMessage);
			view = "checkMail";
		}
		return view;
	}

	@RequestMapping("/emailWelcome")
	public String getWelcomeHomePage() {
		return "welcome";
	}
	
	
	
	@RequestMapping(value = "/emicalculatorPage",method = RequestMethod.GET)
	public String getEMIHomePage() {
		return "emiCal";
	}

	@RequestMapping("/test")
	public String getHomePage() {
		return "test";
	}

	@RequestMapping("/login")
	public String getLoginPage() {
		return "login";
	}

	@RequestMapping("/register")
	public String getRegisterPage() {
		return "register";
	}

	@RequestMapping("/loanApplication")
	public String getLoanAppPage() {
		return "loanApplication";
	}

	@RequestMapping("/eligibilityCal")
	public String getEligibilityPage() {
		return "eligibilityCalculator";
	}

	@RequestMapping("/propertyDetails")
	public String getPropertyPage() {
		return "propertyDetails";
	}

	@RequestMapping("/incomeDetails")
	public String getIncomePage() {
		return "incomeDetails";
	}

	@RequestMapping("/welcome")
	public String getWelcomePage() {
		return "welcome";
	}

	@RequestMapping("/logout")
	public String nextHandlingMethod2(SessionStatus status) {
		status.setComplete();
		return "index";
	}

	@RequestMapping("/personalDetails")
	public ModelAndView getPersonalDetailsPage(@ModelAttribute("username") String username,@RequestParam("emi") int emi) {
		ModelAndView mAndv = null;
		User user = null;
		user = userService.getUserDetails(username);
		mAndv = new ModelAndView();
		mAndv.setViewName("personalDetails");
		mAndv.addObject("user", user);
		mAndv.addObject("EMI", emi);
		
		return mAndv;
	}

	@RequestMapping(value = "/personalDetails", method = RequestMethod.POST)
	public ModelAndView getEmpList(User user, @RequestParam("aadhar") BigDecimal aadhar,
			@RequestParam("pancard") String pancard, @ModelAttribute("username") String username) {

		ModelAndView mAndV = null;
		User userRes = null;
		try {

			userRes = userService.setUserDetails(user, aadhar, pancard, username);

			mAndV = new ModelAndView();
			// Pass-on this data to JSP
			mAndV.setViewName("incomeDetails");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mAndV;
	}

	// Login
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView getValidLogin(ModelMap model, @RequestParam("username") String username,
			@RequestParam("password") String password) {

		List<Loan> loanList = null;

		List<Loan> loanAcceptList = null;

		List<Loan> loanRejectList = null;
		
		List<Loan> loanDocList = null;
		
		List<Loan> fundTransferList = null;
		ModelAndView mAndV = null;
		try {

			// admin login
			if (!userService.validateAdminUser(username, password)) {
				System.out.println("LoginService.validateADMINUser method...");
				model.put("errorMessage", "Invalid Credentials");

				mAndV = new ModelAndView();
				// Pass-on this data to JSP
				mAndV.setViewName("login");
				// mAndV.addObject("staus", "Success");
				// model.put("successMessage", "Login successfull");

			} else {
				mAndV = new ModelAndView();
				mAndV.setViewName("adminIndex");

				// call admin dashb functions
				loanList = userService.getLoanList();
				loanAcceptList = userService.getAcceptedLoanList();
				loanRejectList = userService.getRejectedLoanList();
				loanDocList = userService.getDocVerifiedLoanList();
				fundTransferList = userService.getFundTransferLoanList();

				// set all the list
				mAndV.addObject("list", loanList);
				mAndV.addObject("acceptlist", loanAcceptList);
				mAndV.addObject("rejectlist", loanRejectList);
				mAndV.addObject("doclist", loanDocList);
				mAndV.addObject("fundlist", fundTransferList);
				mAndV.addObject("username", username);
				mAndV.addObject("username", username);

			}

			// user login
			if (!userService.validateUser(username, password)) {
				System.out.println("LoginService.validateUser method...");
				model.put("errorMessage", "Invalid Credentials");

				mAndV = new ModelAndView();

				mAndV.setViewName("login");

			} else {
				mAndV = new ModelAndView();
				mAndV.setViewName("index");
				mAndV.addObject("username", username);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return mAndV;

	}

	// Registration
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView setRegistrationDetails(User user) {
		ModelAndView mAndV = null;

		System.out.println("Registration");
		userService.insertRegDetails(user);
		mAndV = new ModelAndView();
		mAndV.setViewName("index");
		return mAndV;

	}

	// Personal Details

	// INSERT INCOME DETAILS IN DB
	@RequestMapping(value = "/incomeDetails", method = RequestMethod.POST)
	public ModelAndView getPropertyPage(Income income) {
		ModelAndView mAndV = null;

		Income inRes;

		inRes = userService.insertIncomeDetails(income);

		if (inRes != null) {
			System.out.println("Inserted successfully");
			mAndV = new ModelAndView();
			// Pass-on this data to JSP
			mAndV.setViewName("propertyDetails");
		} else {
			System.out.println("ERROR");
		}

		return mAndV;

	}

	// INSERT PROPERTY DETAILS IN DB
	@RequestMapping(value = "/propertyDetails", method = RequestMethod.POST)
	public ModelAndView getPropertyDetailsPage(Property property) {
		ModelAndView mAndV = null;

		Property propRes;

		propRes = userService.insertPropertyDetails(property);

		if (propRes != null) {
			System.out.println("Inserted successfully");
			mAndV = new ModelAndView();
			// Pass-on this data to JSP
			mAndV.setViewName("bankDetails");
		} else {
			System.out.println("ERROR");
		}

		return mAndV;

	}

	// INSERT BANK DETAILS IN DB
	@RequestMapping(value = "/bankDetails", method = RequestMethod.GET)
	public ModelAndView getUploadDetailsPage(Bank bank, @RequestParam("quesResponse") String quesResponse) {
		ModelAndView mAndV = null;

		String str = new String(quesResponse);
		System.out.println("In bank controller");
		System.out.println(str);
		Bank bankRes = null;
		// String quesResponse = "Yes";

		System.out.println("Existing");
		bankRes = userService.insertBankDetails(bank);

		if (bankRes != null) {
			System.out.println("Bank Inserted successfully");
			mAndV = new ModelAndView();
			// Pass-on this data to JSP
			mAndV.setViewName("uploadDocs");
		} else {
			System.out.println("ERROR");
		}

		return mAndV;

	}

	@RequestMapping(value = "/bankNewDetails", method = RequestMethod.GET)
	public ModelAndView getUploadNewDetailsPage(@ModelAttribute("username") String username) {
		ModelAndView mAndV = null;

		Bank bankRes = null;
		// String quesResponse = "Yes";

		System.out.println("NEW User");
		bankRes = userService.insertNewBankDetails(username);
		System.out.println("New Account");

		if (bankRes != null) {
			System.out.println("Bank Inserted successfully");
			mAndV = new ModelAndView();
			// Pass-on this data to JSP
			mAndV.setViewName("uploadDocs");
		} else {
			System.out.println("ERROR");
		}

		return mAndV;

	}

	// upload Files
	@RequestMapping(value = "/uploadDocs", method = RequestMethod.POST)
	public String uploadFile(@RequestParam("files") MultipartFile[] files, HttpServletRequest request, Model model,
			@ModelAttribute("username") String username) {

		String relativeWebPath = "/upload_files";
		String absoluteFilePath = request.getRealPath(relativeWebPath);
		System.out.println("Location" + absoluteFilePath);
		File dir = new File(absoluteFilePath);
		/*
		 * if(!dir.exists()){ dir.mkdir(); }
		 */
		int file_chk = 1;
		String doc_type = null;
		for (MultipartFile file : files) {
			if (!file.isEmpty()) {
				try {
					if (file_chk == 1)
						doc_type = "aadhar";
					else if (file_chk == 2)
						doc_type = "pancard";
					else if (file_chk == 3)
						doc_type = "voterId";
					else if (file_chk == 4)
						doc_type = "salarySlip";
					else if (file_chk == 5)
						doc_type = "loa";
					else if (file_chk == 6)
						doc_type = "noc";
					else
						doc_type = "agreement";

					byte[] bytes = file.getBytes();
					File uploadFile = new File(
							dir.getAbsolutePath() + File.separator + username + "-" + doc_type + ".pdf");
					BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(uploadFile));
					outputStream.write(bytes);
					outputStream.close();

					model.addAttribute("uploadMessage",
							"File Upload Successfully, File Name:" + file.getOriginalFilename());
				} catch (Exception e) {
					e.printStackTrace();
				}
			} // end of if

			file_chk++;
		}

		System.out.println("In upload Function");

		return "loanDetails";
	}

	// insert loan details in db
	@RequestMapping(value = "/loanDetails", method = RequestMethod.POST)
	public ModelAndView getLoanDetailsPage(Loan loan) {
		ModelAndView mAndV = null;

		Loan loanRes = null;
		// String quesResponse = "Yes";

		
		loanRes = userService.insertLoanDetails(loan);

		if (loanRes != null) {
			System.out.println("Loan Inserted successfully");
			mAndV = new ModelAndView();
			// Pass-on this data to JSP
			mAndV.setViewName("index");
		} else {
			System.out.println("ERROR");
		}

		return mAndV;

	}

	@RequestMapping("/loanIdDetails")
	public ModelAndView getEmpDetails(@RequestParam("id") int loanId) {
		ModelAndView mAndV = new ModelAndView("loanIdDetails");
		Loan loan = null;
		try {
			String userId = userService.getLoanUsername(loanId);
			System.out.println(userId);

			// personal details
			User userRes = userService.getLoanUserDetails(userId);
			System.out.println(userRes);
			mAndV.addObject("user", userRes);

			// income details
			Income incomeRes = userService.getLoanIncomeDetails(userId);
			System.out.println(incomeRes);
			mAndV.addObject("income", incomeRes);

			// property details
			Property propRes = userService.getLoanPropDetails(userId);
			System.out.println(propRes);
			mAndV.addObject("property", propRes);

			// loan details
			loan = userService.getLoanAppDetails(loanId);
			System.out.println(loan);
			// Pass-on this data to JSP
			mAndV.addObject("loan", loan);
			/*
			 * List<Object> list = new ArrayList<Object>();
			 * 
			 * list.add( new Integer(1)); list.add( new Integer(2)); list.add(
			 * new Integer(3));
			 * 
			 * list.add( new String("String One")); list.add( new
			 * String("String Two")); list.add( new String("String Three"));
			 * 
			 * for( Object item: list ) { if( item instanceof Integer) {
			 * System.out.println(item+" is Integer"); } else if( item
			 * instanceof String) { System.out.println(item+" is String"); } }
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}
		return mAndV;
	}

	// retireve files
	@RequestMapping("/downloadFiles")
	public void downloadFile3(HttpServletResponse resonse, @RequestParam("id") String username) throws IOException {
		String FILE_PATH = "D:/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/maven-dwellFundedBackupR/upload_files/"
				+ username + "-" + "aadhar" + ".pdf";
		File file = new File(FILE_PATH);

		resonse.setContentType("application/pdf");
		resonse.setHeader("Content-Disposition", "attachment;filename=" + file.getName());
		BufferedInputStream inStrem = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream outStream = new BufferedOutputStream(resonse.getOutputStream());

		byte[] buffer = new byte[1024];
		int bytesRead = 0;
		while ((bytesRead = inStrem.read(buffer)) != -1) {
			outStream.write(buffer, 0, bytesRead);
		}
		outStream.flush();
		inStrem.close();
	}

	// accept request
	@RequestMapping("/acceptRequest")
	public ModelAndView acceptRequest(@RequestParam("id") String userId, @RequestParam("email") String email,
			@ModelAttribute("username") String username) {
		ModelAndView mAndv = null;
		List<Loan> loanList = null;
		List<Loan> loanAcceptList = null;
		
		List<Loan> loanRejectList = null;
		List<Loan> loanDocList = null;
		List<Loan> fundTransferList = null;
		mAndv = new ModelAndView();
		// mail code
		User user = userctx.getBean(User.class, "user");
		// String email = "purva.surve@lntinfotech.com";
		user.setEmail(email);
		// creating message
		String view = "changeRequest";

		// Date date = new Date();
		// System.out.println(date.toString());

		// set appoinment date
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); // Now use today date.
		c.add(Calendar.DATE, 5); // Adding 5 days
		String output = sdf.format(c.getTime());
		System.out.println(output);

		if (user != null) {
			SimpleMailMessage simpleMessage = new SimpleMailMessage();
			simpleMessage.setFrom("donotreply@gmail.com");
			simpleMessage.setTo(email);
			simpleMessage.setSubject("Accepting Loan Application");
			simpleMessage.setText(
					"Your Application has been accepted\n Appoinment Date for document verification is " + output);

			// simpleMessage.setText("Link =
			// http://localhost:9080/maven-dwellfunded/spring/forgotPassword");
			// sending message

			mailSender.send(simpleMessage);
		}

		// adminpage redirection
		int acceptRes;
		acceptRes = userService.acceptRequest(userId);
		// System.out.println(email);
		if (acceptRes > 0)
			mAndv.setViewName("adminIndex");

		// call admin dashb functions again
		// call admin dashb functions
		loanList = userService.getLoanList();
		loanAcceptList = userService.getAcceptedLoanList();
		loanRejectList = userService.getRejectedLoanList();
		loanDocList = userService.getDocVerifiedLoanList();
		fundTransferList = userService.getFundTransferLoanList();
		
		// set all the list
		mAndv.addObject("list", loanList);
		mAndv.addObject("acceptlist", loanAcceptList);
		mAndv.addObject("rejectlist", loanRejectList);
		mAndv.addObject("doclist", loanDocList);
		mAndv.addObject("fundlist", fundTransferList);
		mAndv.addObject("username", username);

		return mAndv;
	}

	// reject request
	@RequestMapping("/rejectRequest")
	public ModelAndView rejectRequest(@RequestParam("id") String userId) {
		
		List<Loan> loanList = null;
		List<Loan> loanAcceptList = null;
		
		List<Loan> loanRejectList = null;
		List<Loan> loanDocList = null;
		List<Loan> fundTransferList = null;
		ModelAndView mAndv = null;
		mAndv = new ModelAndView();

		int rejectRes;
		rejectRes = userService.rejectRequest(userId);
		// System.out.println(email);
		if (rejectRes > 0)
			mAndv.setViewName("adminIndex");
		
		loanList = userService.getLoanList();
		loanAcceptList = userService.getAcceptedLoanList();
		loanRejectList = userService.getRejectedLoanList();
		loanDocList = userService.getDocVerifiedLoanList();
		fundTransferList = userService.getFundTransferLoanList();
		
		// set all the list
		mAndv.addObject("list", loanList);
		mAndv.addObject("acceptlist", loanAcceptList);
		mAndv.addObject("rejectlist", loanRejectList);
		mAndv.addObject("doclist", loanDocList);
		mAndv.addObject("fundlist", fundTransferList);
		
		
		return mAndv;
	}

	// documentverify request
	@RequestMapping(value = "/documentVerify",method = RequestMethod.GET )
	public ModelAndView documentVerifyRequest(@RequestParam("id") String userId) {
		
		List<Loan> loanList = null;
		List<Loan> loanAcceptList = null;
		
		List<Loan> loanRejectList = null;
		List<Loan> loanDocList = null;
		List<Loan> fundTransferList = null;
		
		ModelAndView mAndv = new ModelAndView("adminIndex");

		int docRes;
		docRes = userService.docVerifyRequest(userId);
		// System.out.println(email);
		if (docRes > 0)
		
		loanList = userService.getLoanList();
		loanAcceptList = userService.getAcceptedLoanList();
		loanRejectList = userService.getRejectedLoanList();
		loanDocList = userService.getDocVerifiedLoanList();
		fundTransferList = userService.getFundTransferLoanList();
		
		// set all the list
		mAndv.addObject("list", loanList);
		mAndv.addObject("acceptlist", loanAcceptList);
		mAndv.addObject("rejectlist", loanRejectList);
		mAndv.addObject("doclist", loanDocList);
		mAndv.addObject("fundlist", fundTransferList);
		
		
		return mAndv;
	}

	// fundtransfer request
	@RequestMapping("/fundTransfer")
	public ModelAndView fundTransferRequest(@RequestParam("id") String userId) {
		
		List<Loan> loanList = null;
		List<Loan> loanAcceptList = null;
		
		List<Loan> loanRejectList = null;
		List<Loan> loanDocList = null;
		List<Loan> fundTransferList = null;
		
		ModelAndView mAndv = null;
		mAndv = new ModelAndView();

		int fundRes;
		fundRes = userService.fundTransferRequest(userId);
		// System.out.println(email);
		if (fundRes > 0)
			mAndv.setViewName("adminIndex");
		
		loanList = userService.getLoanList();
		loanAcceptList = userService.getAcceptedLoanList();
		loanRejectList = userService.getRejectedLoanList();
		loanDocList = userService.getDocVerifiedLoanList();
		fundTransferList = userService.getFundTransferLoanList();
		
		// set all the list
		mAndv.addObject("list", loanList);
		mAndv.addObject("acceptlist", loanAcceptList);
		mAndv.addObject("rejectlist", loanRejectList);
		mAndv.addObject("doclist", loanDocList);
		mAndv.addObject("fundlist", fundTransferList);
		
		
		return mAndv;
	}
	
	

	// Account Summary

	@RequestMapping("/accountSummary")
	public ModelAndView accountSummary(@ModelAttribute("username") String username) {
		ModelAndView mAndv = null;
		mAndv = new ModelAndView();

		Bank bankRes;
		bankRes = userService.getAccountSummary(username);

		if (bankRes != null) {
			System.out.println("Loan Inserted successfully");
			mAndv = new ModelAndView();
			// Pass-on this data to JSP
			mAndv.setViewName("accountSummary");
			mAndv.addObject("accSum", bankRes);

		} else {
			System.out.println("ERROR");
		}
		return mAndv;
	}

	// Loan Tracker Page
	@RequestMapping("/loanTrackerPage")
	public String getLoanTrackerPage() {
		return "loanTracker";
	}

	@RequestMapping(value = "/loanTracker", method = RequestMethod.POST)
	public ModelAndView loanTracker(@ModelAttribute("username") String username, @RequestParam("dob") String dob) {
		ModelAndView mAndv = null;
		mAndv = new ModelAndView();

		Loan loanRes = null;
		// authenticate user first
		boolean authRes = userService.validateLoanTrackerId(username, dob);
		if (authRes) {
			loanRes = userService.getloanTracker(username);
		} else {
			System.out.println("Authentication failed");
		}

		// return loan details and status

		String statusOutput;
		int statusRes = 0;
		if (loanRes != null) {
			statusRes = loanRes.getFormStatus();

			if (statusRes == 1) {
				statusOutput = "Approved .Waiting for Document Verifiction";
			} else if (statusRes == 2) {
				statusOutput = "Rejected";
			} else if (statusRes == 3) {
				statusOutput = "Document Verified.";
			} else {
				statusOutput = "Credit Transferred";

			}
		} else {
			statusOutput = "No pending loan request. Visit Homepage for loan details";
		}

		mAndv.addObject("loan", loanRes);
		mAndv.addObject("status", statusOutput);
		mAndv.setViewName("loanStatus");

		return mAndv;
	}

}
