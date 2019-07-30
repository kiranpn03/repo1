package com.aa.apauto.connectme.util;

public class Constants 
{

	public static final String FLIGHT_SERVICE = "FlightService";
	public static final String WHAT_I_WANT_FLIGHT_LEG = "Flight/Leg/*";
	public static final String WHAT_I_WANT_CREW = "Flight/CrewMember";
	public static final String WHAT_I_WANT_CABIN_CAPACITY = "Flight/CabinCapacity";
	public static final String WHAT_I_WANT_FOS_PARTITION = "Flight/FosPartition";
	public static final String DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";
	public static final String ENCODING = "UTF-8";
	public static final String COUNT_ELEMENT = "<Count>";
	public static final String OPEN_BRACKET = "<";
	
	public static final String CALENDAR_UTC = "UTC";
	public static final String CALENDAR_CST = "America/Chicago";
	
	public static final String SINGLE_DIGIT_ZERO = "0";
	public static final String TWO_DIGIT_ZERO = "00";
	public static final String THREE_DIGIT_ZERO = "000";
	
	public static final String AA_PARTITION_CODE = "AA";
	public static final String MQ_PARTITION_CODE = "MQ";
	public static final String TE_PARTITION_CODE = "TE";
	public static final String US_PARTITION_CODE = "US";
	public static final String XS_PARTITION_CODE = "XS";
	public static final String Y6_PARTITION_CODE = "Y6";
	
	public static final String US_AIRLINE_CODE = "US";
	public static final String AA_AIRLINE_CODE = "AA";
	
	public static final String KICKOFF_FLIGHT_INDICATOR = "Y";
	public static final String DEICE_INDICATOR = "true";
	public static final String ANTI_ICE_INDICATOR = "true";
	public static final String BONDED_FUEL_INDICATOR = "true";
	
	public static final String FLIGHT_ONTIME ="OT";
	public static final String FLIGHT_EARLY ="EY";
	public static final String FLIGHT_DELAY ="DL";
	public static final String FLIGHT_OUT ="OU";
	public static final String FLIGHT_OFF ="OF";
	public static final String FLIGHT_ON ="ON";
	public static final String FLIGHT_IN ="IN";
	public static final String CANCELLED ="CX";
	public static final String DIVERTED ="DV";
	public static final String DELETED ="DX";
	public static final String DELETE_STATUS_CODE = "X";
	public static final String CANCEL_STATUS_CODE = "Z";
	
	public static final String ONDEMAND_EVENT = "ONDEMAND";
	public static final String DEFAULT_EVENT = "DEFAULT";
	public static final String CANCEL_EVENT = "CANCEL";
	public static final String IN_EVENT = "IN";
	public static final String OFF_EVENT = "OFF";
	public static final String ON_EVENT = "ON";
	public static final String OUT_EVENT = "OUT";
	public static final String CYCLE_EVENT = "CYCLE";
	public static final String CREATE_EVENT = "CREATE";
	public static final String CONTINUATION_EVENT = "CONTINUATION";
	public static final String CREW_EVENT = "CREW";
	public static final String DIVERSION_EVENT = "DIVERSION";
	public static final String GATE_EVENT = "GATE";
	public static final String ETD_EVENT = "ETD";
	public static final String FUELSLIP_EVENT = "FUELSLIP";
	public static final String CREW_BAD_EMP_NUM ="000000";
	public static final String IS_FA_PATTERN = "([0-9]*)";
	
	public static final String CREW_CHASE_FA_IND = "95,96,99";
	public static final String CREW_NHIRE_FA_IND = "97";
	public static final String CREW_XTRA_FA_IND = "VM";
	public static final String CREW_FA_IND = "FA";
	public static final String CREW_FA_DP_IND = "DP";
	public static final String CREW_CA_IND = "CA";
	public static final String CREW_RC_IND = "RC";
	public static final String CREW_FOFFICER_IND = "FB,FC,FO";
	public static final String CREW_XTRA_COCKPIT_IND = "IN,XA";   

	public static final String CREW_CAPTAIN_IND = "CAPTAIN";
	public static final String CREW_CAPTAIN_DEADHEAD_IND = "CAPTAIND";
	public static final String CREW_RESERVE_CAPTAIN_IND = "RCAPTAIN";
	public static final String CREW_RESERVE_CAPTAIN_DEADHEAD_IND = "RCAPTAIND";
	public static final String CREW_FIRST_OFFICER_IND = "FOFFICER";
	public static final String CREW_FIRST_OFFICER_DEADHEAD_IND = "FOFFICERD";
	public static final String CREW_COCKPIT_XTRA_IND = "PILOTX";
	public static final String CREW_PILOT_IND = "PILOT";
	public static final String CREW_PILOT_DEADHEAD_IND = "PILOTD";
	public static final String CREW_COCKPIT_XTRA_DEADHEAD_IND = "PILOTXD";
	public static final String CREW_FLIGHT_ATTENDANT_IND = "FA";
	public static final String CREW_FLIGHT_ATTENDANT_DEADHEAD_IND = "FAD";
	public static final String CREW_FLIGHT_ATTENDANT_EXTRA_IND = "FAX";
	public static final String CREW_FLIGHT_ATTENDANT_EXTRA_DEADHEAD_IND = "FAXD";
	public static final String CREW_FLIGHT_ATTENDANT_CHASE_IND = "CFA";
	public static final String CREW_FLIGHT_ATTENDANT_CHASE_DEADHEAD_IND = "CFAD";
	public static final String CREW_FLIGHT_ATTENDANT_NHIRE_IND = "FAN";
	public static final String CREW_FLIGHT_ATTENDANT_NHIRE_DEADHEAD_IND = "FAND";
	public static final String CREW_FLIGHT_ATTENDANT_DSEQ_IND = "FADS";
	public static final String CREW_FLIGHT_ATTENDANT_DSEQ_DEADHEAD_IND = "FADSD";
	
	public static final String INPUT_FHUB_CREW_CHANNEL = "inputFhubCrewChannel";
	public static final String INPUT_LKA_CREW_CHANNEL = "inputLKACrewChannel";
	public static final String INPUT_FLIGHT_NBR_CHANNEL = "inputFlightNbrChannel";
	public static final String MNTNC_DMI_EVENT = "DMI";
	
	public static final String MNTNC_CREATE_DMI_EVENT = "ASSIGNDMI";
	public static final String MNTNC_CLEAR_DMI_EVENT = "CLEARDMI";
	public static final String MNTNC_DELETE_DMI_EVENT = "DELETEDMI";
	public static final String MNTNC_UPDATE_DMI_EVENT = "UPDATEDMI";
	public static final String MNTNC_OTS_EVENT = "OTS";
	public static final String MNTNC_ECO_EVENT = "OTS";
	
	public static final String MNTNC_DMI_CLEARED = "CLEARED";
	public static final String MNTNC_DMI_DELETED = "DELETED";
	public static final String MNTNC_DMI_OPEN = "OPEN";
	
	public static final String DMI_DISPATCH_CONCUR_IND = "Y";
	public static final String DMI_FLT_PLAN_OUTPUT_IND = "Y";
	public static final String DMI_DISPATCH_DISPLAY_IND = "Y";
	
	public static final String ACFT_STATUS_OTS = "OTS";
	public static final String ACFT_STATUS_RTS = "RTS";
	
	public static final String OTS_REMARKS_DELIMITTER = ", ";

	public static final String DEFAULT_MQ_CONCURRENCY_SETTING = "1-8";
	
	public static final String DATE_FORMAT_DDMMYY = "ddMMyy";
	public static final String DATE_FORMAT_DDMMYYYY = "ddMMyyyy";
	public static final String DATE_TIME_FORMAT_YYYYMMDDHHmm = "yyyy-MM-dd HH:mm";
	public static final int LKA_FLIGHT_KEY_LENGTH = 21;
	public static final int LKA_FLIGHT_DATE_LENGTH = 6;
	public static final String LKA_STN_HASH_DELIMITTER = "(?<=\\G.{2})";
	
	public static final String GATE_CHANGE_MSG_HEADER = "XXXXX GATE CHANGE XXXXX";
	public static final String ETD_CHANGE_MSG_HEADER = "XXXXX ETD CHANGE XXXXX";
	public static final String MSG_DEP_GATE_PREFIX = "DEP GATE: ";
	public static final String MSG_PREV_DEP_GATE_PREFIX = "PREVIOUS DEP GATE: ";
	public static final String MSG_DEP_TERMINAL_PREFIX = "DEP TERMINAL: ";
	public static final String MSG_PREV_DEP_TERMINAL_PREFIX = "PREVIOUS DEP TERMINAL: ";	
	public static final String MSG_ARR_GATE_PREFIX = "ARR GATE: ";
	public static final String MSG_PREV_ARR_GATE_PREFIX = "PREVIOUS ARR GATE: ";
	public static final String MSG_ARR_TERMINAL_PREFIX = "ARR TERMINAL: ";
	public static final String MSG_PREV_ARR_TERMINAL_PREFIX = "PREVIOUS ARR TERMINAL: ";	
	public static final String MSG_FD_PREFIX = "FD: ";
	public static final String MSG_NEW_LINE_CHAR = "\r\n";
	public static final String MSG_LATEST_ETD = "LATEST ETD: ";
	
	public static final String TOPIC_NAME_PREFIX = "/CM/";
	public static final String MSG_TOPIC_TOWER_GATE_CHANGES = "Tower Ops/Gate Changes";
	public static final String MSG_TOPIC_DAILYOPS_ETD_CHANGES = "DailyOps/ETD_Changes/";
	public static final String MSG_TOPIC_FLIGHT = "EMP/AGT/FLIGHT/";
	public static final String MSG_RECEPIENT_TYPE_N = "N";
	public static final String MSG_RECEPIENT_TYPE_F = "F";
	public static final String MSG_SEND_PROFILE_TYPE_N = "N";
	public static final String MSG_TOPIC_NAME_SUFFIX = "/";
	public static final String DEFAULT_MSG_TYPE ="U";
	public static final String MSG_PRIORITY_N ="N";
	public static final String SYSTEM_USERSTATION = "HDQ";
	public static final String MSG_NEW_STATUS = "N";
	public static final String DEFAULT_APP_NAME = "connectme";
	public static final String DEFAULT_APP_KEY = "CMNGPC";
	public static final String DEFAULT_AUTH_TOKEN = "SECTOK11";
	public static final String DEFAULT_DEVICE_ID = "connectme_server";
	public static final String DEFAULT_FROM_PROFILE = "EMP";
	public static final String DEFAULT_GROUP_NAME = "AAGENT";
	public static final String DEFAULT_GATE_MSG_ID = "GATE-CHANGE-MSG";
	public static final String DEFAULT_USER_ID = "Z1036221";
	
	public static final String FUEL_DIST_SEPARATOR = ":";
	public static final String FUEL_DIST_DELIMITTER = ",";
	
	 public static final String ACTIVE_STATUS = "ACTIVE";
	 
	 public static final String APP_ID = "FLTFEEDER";
	 public static final String FEEDER_TOPIC = "FLIGHT";
	 public static final String USER_ID = "FEEDER";
	 public static final String FLIGHT_UPDATES = "FLIGHT_UPDATE";
	 //CM_TOPIC_PREFIX
	 public static final String CM_TOPIC_PREFIX = "/CM/";
	 
	 //SEND MESSAGE REQUEST CONSTANTS
	 public static final String SEND_MSG_APPID = "FLT FEEDER";
	 public static final String SEND_MSG_FNAME = "Automated";
	 public static final String SEND_MSG_LNAME = "Message";
	 public static final String SEND_MSG_WRGP = "SABRE";
	 public static final String SEND_MSG_ROLE = "FlightHub";
	 public static final String SEND_MSG_USR = "00999999";
	 public static final String SEND_MSG_ERR = "0088888";
	 
}
