package com.udaan.interview;

/**
 * TODO - Make other 2 classes extend this
 */
public class GetBalanceBaseModel {
	int httpCode;
	String httpMessage;
	String moreInformation;
	//GetBalanceBaseModel(GetBalanceResponseDetails getBalanceResponseDetails){
		//GetBalanceModel getBalanceModel = new GetBalanceModel(getBalanceResponseDetails);
		//getBalanceModel.setGetBalanceResponse(getBalanceResponseDetails);
	//}
public GetBalanceResponseDetails set(GetBalanceResponseDetails getBalanceResponse) {
	
	GetBalanceResponseDetails getBalanceResponse1 = new GetBalanceResponseDetails(getBalanceResponse.version, getBalanceResponse.accountCurrencyCode,getBalanceResponse.accountBalanceAmount,getBalanceResponse.lowBalanceAlert);
	return getBalanceResponse1;
}
	//GetBalanceModel getBalanceModel;
	//GetBalanceResponseDetails getBalanceResponseDetails;
	//((getBalanceModel)p).setGetBalanceResponse();
	//GetBalanceBaseModel(getBalanceResponseDetailsgetBalanceResponseDetails);
	//getBalanceModel.setGetBalanceResponse(getBalanceResponse);
//	public GetBalanceResponseDetails getGetBalanceResponse() {
//		return getBalanceResponse;
//	}
//	public void setGetBalanceResponse(GetBalanceResponseDetails getBalanceResponse) {
//		this.getBalanceResponse = getBalanceResponse;
//	}
	//GetBalanceErrorResponseModel getBalanceErrorResponseModel= new GetBalanceErrorResponseModel(httpCode,httpMessage,moreInformation);
//	public GetBalanceBaseModel(GetBalanceResponseDetails getBalanceResponse) {
//		this.getBalanceResponse = getBalanceResponse;
//	}

//	public GetBalanceResponseDetails getGetBalanceResponse() {
//		return getBalanceResponse;
//	}
//
//	public void setGetBalanceResponse(GetBalanceResponseDetails getBalanceResponse) {
//		this.getBalanceResponse = getBalanceResponse;
//	}
	
}