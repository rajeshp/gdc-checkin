package com.adobe.gdc.checkin.constants;

public class QuartelyBDOConstants {

	//Quarter Calendar Date range keys
	public static final String START_DATE_QUARTER1 = "startDateQuarter1";
	public static final String END_DATE_QUARTER1 = "endDateQuarter1";
	public static final String START_DATE_QUARTER2 = "startDateQuarter2";
	public static final String END_DATE_QUARTER2 = "endDateQuarter2";
	public static final String START_DATE_QUARTER3 = "startDateQuarter3";
	public static final String END_DATE_QUARTER3 = "endDateQuarter3";
	public static final String START_DATE_QUARTER4 = "startDateQuarter4";
	public static final String END_DATE_QUARTER4 = "endDateQuarter4";
	
	//Quarter statuses
	public static final String CURRENT_QUARTER = "current";
	public static final String PREVIOUS_QUARTER = "previous";
	public static final String FUTURE_QUARTER = "future";
	
	//BDO form actions
	public static final String SAVE = "save";
	public static final String SUBMIT = "submit";
	
	//BDO form save/submit actions response
	public static final String SUCCESS = "success";
	public static final String RESPONSE_TYPE = "application/json";
	public static final String CHARACTER_ENCODING = "UTF-8";
	
	public static final String EMPTY_STRING = "";
	
	//BDO form params
	public static final String USER_ID = "userID";
	public static final String MANAGERS_ID = "managersID";
	public static final String QUARTER_NUMBER = "quarterNumber";
	public static final String ANNUAL_YEAR = "annualYear";
	public static final String OBJECTIVES = "objectives";
	public static final String ACHIEVEMENTS = "achievements";
	public static final String DESIGNATION = "designation";
	public static final String PERCENTAGE_ACHIEVED = "percentageAchieved";
	public static final String NAME = "name";
	public static final String EMPLOYEE_ID = "employeeID";
	public static final String STATUS = "status";
	public static final String OBJECTIVES_ARRAY = "objectives[]";
	public static final String ACHIEVEMENTS_ARRAY = "achievements[]";
	
	//BDO Report JSON params
	public static final String INDEX = "index";
	public static final String TOTAL_RECORDS = "iTotalRecords";
	public static final String AA_DATA = "aaData";
	
	//User profile properties
	public static final String PROFILE_EMPLOYEE_ID = "profile/employeeID";
	public static final String PROFILE_MANAGER_ID = "profile/managersID";
	public static final String PROFILE_DESIGNATION =  "profile/designation";
	public static final String PROFILE_FULL_NAME = "profile/fullName";
	public static final String PROFILE_DIRECT_REPORTS = "profile/directReports";
	
	//ADOBE_EMAIL_MAIL
	public static final String ADOBE_EMAIL_EXTENTION = "@adobe.com";
	
	//BDO form statuses
	public static final String SUBMITTED = "SUBMITTED";
	public static final String NOT_SUBMITTED = "NOT SUBMITTED";
	
	//Repository root-path where BDO data is stored 
	public static final String GDC_CHECKIN_REPOSITORY_BASE_PATH = "/content/gdc-check-in-store";
	
}
