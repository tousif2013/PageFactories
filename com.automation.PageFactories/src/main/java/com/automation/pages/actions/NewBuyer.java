package com.automation.pages.actions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;

import com.automation.Core.Page;
import com.automation.Locators.NewBuyerlocator;

public class NewBuyer extends Page {

	public static NewBuyerlocator newBuyerlocator;

	public void NewBuyer() {

		this.newBuyerlocator = new NewBuyerlocator();

		PageFactory.initElements(driver, this.newBuyerlocator);
	}

	public static void Constitution(String Value) {

		// contitution type
		typeUsingJS(newBuyerlocator.constituitionElement, Value);
	}

	public static void buyername(String Value) {
		// buyername
		typeUsingJS(newBuyerlocator.bankname, Value);
	}

	public static void pan(String Value) {
		// pan no
		typeUsingJS(newBuyerlocator.panElement, Value);
	}

	public static void companyemail(String Value) {
		// company email
		typeUsingJS(newBuyerlocator.companyemail, Value);
	}

	public static void Cin(String Value) {
		// cin no
		typeUsingJS(newBuyerlocator.Cin, Value);
	}

	public static void gstin(String Value) {
		// gstin
		typeUsingJS(newBuyerlocator.gstin, Value);
	}

	public static void address1(String Value) {
		// address line1
		typeUsingJS(newBuyerlocator.address1, Value);
	}

	public static void address2(String Value) {
		// addressline2
		typeUsingJS(newBuyerlocator.address2, Value);
	}

	public static void city(String Value) {// city
		typeUsingJS(newBuyerlocator.cityElement, Value);
	}

	public static void state(String Value) {
		// state
		typeUsingJS(newBuyerlocator.stateElement, Value);
	}

	public static void country(String Value) {

		// country
		typeUsingJS(newBuyerlocator.countryElement, Value);
	}

	public static void pincode(String Value) {

		// pincode
		typeUsingJS(newBuyerlocator.pincodElement, Value);
	}

	public static void phoneno(String Value) {

		// phone no
		typeUsingJS(newBuyerlocator.phoneno, Value);
	}

	public static void ArbitraseRate(String Value) {
		// arbitrage
		typeUsingJS(newBuyerlocator.ArbitraseRate, Value);
	}

	public static void bankname(String Value) {
		// bankname
		typeUsingJS(newBuyerlocator.bankname, Value);
	}

	public static void bankacc(String Value) {
		// bank account
		typeUsingJS(newBuyerlocator.bankacc, Value);
	}

	public static void bankIFSC(String Value) {

		// bank ifsc
		typeUsingJS(newBuyerlocator.bankIFSC, Value);
	}

	public static void rating(String Value) {
		typeUsingJS(newBuyerlocator.rating, Value);
	}

	public static void industry(String Value) {
		typeUsingJS(newBuyerlocator.industry, Value);
	}

	public static void appversion(String Value) {
		typeUsingJS(newBuyerlocator.appversion, Value);
	}

	public static void relationshipmanager(String Value) {
		// relationship manager
		typeUsingJS(newBuyerlocator.relationshipmanager, Value);
	}

	public static void minicreditperiod(String Value) {
		// suppliermin credit perid
		typeUsingJS(newBuyerlocator.minicreditperiod, Value);
	}

	public static void maxceridperid(String Value) {
		// max supplier credit period
		typeUsingJS(newBuyerlocator.maxceridperid, Value);
	}

	public static void buyercode(String Value) {
		// buyerCode
		typeUsingJS(newBuyerlocator.buyercode, Value);
	}

	public static void kycrequired(String Value) {
		// kycRequiredAdd
		typeUsingJS(newBuyerlocator.kycrequired, Value);
	}

	public static void coveragegroupadd(String Value) {
		// coverageGroupAdd
		typeUsingJS(newBuyerlocator.coveragegroupadd, Value);
	}

	public static void smecenter(String value) {
		// smeCenterHeadMailIdAdd
		typeUsingJS(newBuyerlocator.smecenter, value);
	}

	public static void faxadd(String Value) {
		// faxAdd
		typeUsingJS(newBuyerlocator.faxadd, Value);
	}

	public static void leino(String Value) {
		// leiNoAdd
		typeUsingJS(newBuyerlocator.leino, Value);
	}

	public static void dateofincorporation(String Value) {
		// dateOfIncorporationAdd
		typeUsingJS(newBuyerlocator.dateofincorporation, Value);
	}

	public static void smecenteradd(String value) {
		// smeCenterAdd
		typeUsingJS(newBuyerlocator.smecenteradd, value);
	}

	public static void initaialsetupwizard(String Value) {
		// initail setupwizard
		typeUsingJS(newBuyerlocator.initaialsetupwizard, Value);
	}

	public static void district(String Value) {
		// distric
		typeUsingJS(newBuyerlocator.district, Value);
	}

	public static void tnapplied(String Value) {
		// tncpending
		typeUsingJS(newBuyerlocator.tnapplied, Value);
	}

	public static void submit(String Value) {
		// submit
		typeUsingJS(newBuyerlocator.submit, Value);
	}

	public static void cancel(String Value) {
		// cancel
		typeUsingJS(newBuyerlocator.cancel, Value);
	}

	public class UserActions {

		public static void addNewUser(String value) {

			typeUsingJS(newBuyerlocator.addNewUser, value);
		}

		public static void emailNewUser(String value) {
			typeUsingJS(newBuyerlocator.emailNewUser, value);
		}

		public static void firstNameNewUser(String value) {
			typeUsingJS(newBuyerlocator.firstNameNewUser, value);
		}

		public static void lastNameNewUser(String value) {
			typeUsingJS(newBuyerlocator.lastNameNewUser, value);
		}

		public static void contactNoNewUser(String value) {
			typeUsingJS(newBuyerlocator.contactNoNewUser, value);
		}

		public static void allNewUserRole(String value) {
			typeUsingJS(newBuyerlocator.allNewUserRole, value);
		}

		public static void addNewUserSubmit(String value) {
			typeUsingJS(newBuyerlocator.addNewUserSubmit, value);
		}

		public static void errorCodes() {

		}

		private static final Map<String, String> expectedErrorMessages = new HashMap<>();

		static {

			expectedErrorMessages.put("Buyername_Css", "Buyer name is mandatory");
			expectedErrorMessages.put("Pan_Css", "PAN is mandatory");
			expectedErrorMessages.put("Cin_Css", "CIN number is required.");
			expectedErrorMessages.put("GstinNoAdd_Css", "GSTIN is mandatory");
			expectedErrorMessages.put("City_Css", "City is mandatory");
			expectedErrorMessages.put("StateAdd_Css", "State is mandatory");
			expectedErrorMessages.put("countryAdd", "Country is required.");
			expectedErrorMessages.put("pincodeAdd", "PIN Code is mandatory");
			expectedErrorMessages.put("phoneAdd_Css", "Company contact number is mandatory");
			expectedErrorMessages.put("arbitraseRateAdd_Css", "Corporate Arbitrage % is mandatory");
			expectedErrorMessages.put("bankNameAdd_Css", "Bank name is mandatory");
			expectedErrorMessages.put("bankAccAdd_Css", "Bank Account number is mandatory");
			expectedErrorMessages.put("bankIfscAdd_Css", "Bank IFSC is mandatory");
			expectedErrorMessages.put("relationshipManagerAdd_Css", "Relationship manager is mandatory");
			expectedErrorMessages.put("minCreditPeriod_Css", "Supplier Minimum Credit Period is mandatory");
			expectedErrorMessages.put("maxCreditPeriod_Css", "Supplier Maximum Credit Period is mandatory");
			expectedErrorMessages.put("buyerCode_Css", "Buyer Code is mandatory");
			expectedErrorMessages.put("kycRequiredAdd_Css", "KYC required is mandatory");
			expectedErrorMessages.put("coverageGroupAdd_Css", "Coverage group is required.");
			expectedErrorMessages.put("smeCenterHeadMailIdAdd", "SME center head mail ID is required.");
			expectedErrorMessages.put("faxAdd_Css", "Fax is required.");
			expectedErrorMessages.put("leiNoAdd_Css", "LEI number is required.");
			expectedErrorMessages.put("dateOfIncorporationAdd_Css", "Date of Incorporation is mandatory");
			expectedErrorMessages.put("smeCenterAdd_Css", "SME center is required.");
			expectedErrorMessages.put("initialSetupWizardAdd_Css", "Initial Setup Wizard is mandatory");
			expectedErrorMessages.put("districtAdd_Css", "District is required.");
			expectedErrorMessages.put("tncAppliedForTypedAdd_Css", "TNC is required.");
		}

	}
}