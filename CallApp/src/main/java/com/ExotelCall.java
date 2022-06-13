package com;

import java.io.IOException;

import com.google.gson.Gson;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;




class ExotelCall {
	public static String customerNumber = "09629403196";
	public static String url = "http://my.exotel.com/";
	public static String exotelsid = "quartrdesign1";
	public static String flow_id = "503500";
	public static String apiid = "3f0ff37250f81986b13996322ae209d7cdfe8084d1cace2c";
	public static String apitoken = "2238d338c09f545d0df5d2e238fe17ea33f1cb966d613e27";

	public ExotelResponse connectCustomerToFlow() {
		OkHttpClient client = new OkHttpClient().newBuilder().build();
		RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
				.addFormDataPart("From", customerNumber)
				.addFormDataPart("Url", url + exotelsid + "/exoml/start_voice/" + flow_id).build();

		String credentials = okhttp3.Credentials.basic(apiid, apitoken);

		Request request = new Request.Builder()
				.url(String.format(ExotelStrings.CONNECT_CUSTOMER_TO_FLOW_URL, exotelsid)).method("POST", body)
				.addHeader("Authorization", credentials).addHeader("Content-Type", "application/json").build();

		try {
			Response response = client.newCall(request).execute();
			Gson connect = new Gson();
			String res = null;
			try {
				res = response.body().string();
			} catch (IOException e) {
				e.printStackTrace();
			}

			ExotelResponse SuccessResponse = connect.fromJson(res, ExotelResponse.class);

			int status = response.code();

			if (status == 200) {
				ExotelSuccessResponse cust = new ExotelSuccessResponse(0);
				return cust;
			} else {
				ExotelFailureResponse cust = new ExotelFailureResponse(0);
				return cust;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		ExotelFailureResponse cust = new ExotelFailureResponse(0);
		return cust;
	}
}