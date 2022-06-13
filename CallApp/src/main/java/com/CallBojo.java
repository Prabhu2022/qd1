package com;

public class CallBojo {

	private String CallSid= "quartrdesign1";
	private String CallFrom = "04440115218";
	private String CallTo = "09629403196"; 
	private String Direction = "outbound-dial";
	private String Created;
	private String DialCallDuration;
	private String StartTime;
	private String EndTime;
	private String CallType ="completed";
	private String DialWhomNumber;
	private String flow_id ="503500";
	private String From;
	private String To;
	private String CurrentTime;
	private String DialCallStatus="completed";
	private String CustomField;
	
	
	public CallBojo() {
		super();
	}
	public String getCallSid() {
		return CallSid;
	}
	public void setCallSid(String callSid) {
		CallSid = callSid;
	}
	public String getCallFrom() {
		return CallFrom;
	}
	public void setCallFrom(String callFrom) {
		CallFrom = callFrom;
	}
	public String getCallTo() {
		return CallTo;
	}
	public void setCallTo(String callTo) {
		CallTo = callTo;
	}
	public String getDirection() {
		return Direction;
	}
	public void setDirection(String direction) {
		Direction = direction;
	}
	public String getCreated() {
		return Created;
	}
	public void setCreated(String created) {
		Created = created;
	}
	public String getDialCallDuration() {
		return DialCallDuration;
	}
	public void setDialCallDuration(String dialCallDuration) {
		DialCallDuration = dialCallDuration;
	}
	public String getStartTime() {
		return StartTime;
	}
	public void setStartTime(String startTime) {
		StartTime = startTime;
	}
	public String getEndTime() {
		return EndTime;
	}
	public void setEndTime(String endTime) {
		EndTime = endTime;
	}
	public String getCallType() {
		return CallType;
	}
	public void setCallType(String callType) {
		CallType = callType;
	}
	public String getDialWhomNumber() {
		return DialWhomNumber;
	}
	public void setDialWhomNumber(String dialWhomNumber) {
		DialWhomNumber = dialWhomNumber;
	}
	public String getFlow_id() {
		return flow_id;
	}
	public void setFlow_id(String flow_id) {
		this.flow_id = flow_id;
	}
	public String getFrom() {
		return From;
	}
	public void setFrom(String from) {
		From = from;
	}
	public String getTo() {
		return To;
	}
	public void setTo(String to) {
		To = to;
	}
	public String getCurrentTime() {
		return CurrentTime;
	}
	public void setCurrentTime(String currentTime) {
		CurrentTime = currentTime;
	}
	public String getDialCallStatus() {
		return DialCallStatus;
	}
	public void setDialCallStatus(String dialCallStatus) {
		DialCallStatus = dialCallStatus;
	}
	public String getCustomField() {
		return CustomField;
	}
	public void setCustomField(String customField) {
		CustomField = customField;
	}
	
}