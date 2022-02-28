package com.samarkaton.lapakta.utils.api.service;

import com.samarkaton.lapakta.json.CheckStatusTransRequest;
import com.samarkaton.lapakta.json.CheckStatusTransResponse;
import com.samarkaton.lapakta.json.DetailRequestJson;
import com.samarkaton.lapakta.json.DetailTransResponseJson;
import com.samarkaton.lapakta.json.GetNearRideCarRequestJson;
import com.samarkaton.lapakta.json.GetNearRideCarResponseJson;
import com.samarkaton.lapakta.json.ItemRequestJson;
import com.samarkaton.lapakta.json.LocationDriverRequest;
import com.samarkaton.lapakta.json.LocationDriverResponse;
import com.samarkaton.lapakta.json.RideCarRequestJson;
import com.samarkaton.lapakta.json.RideCarResponseJson;
import com.samarkaton.lapakta.json.SendRequestJson;
import com.samarkaton.lapakta.json.SendResponseJson;
import com.samarkaton.lapakta.json.fcm.CancelBookRequestJson;
import com.samarkaton.lapakta.json.fcm.CancelBookResponseJson;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Ourdevelops Team on 10/17/2019.
 */

public interface BookService {

    @POST("customerapi/list_ride")
    Call<GetNearRideCarResponseJson> getNearRide(@Body GetNearRideCarRequestJson param);

    @POST("customerapi/list_car")
    Call<GetNearRideCarResponseJson> getNearCar(@Body GetNearRideCarRequestJson param);

    @POST("customerapi/request_transaksi")
    Call<RideCarResponseJson> requestTransaksi(@Body RideCarRequestJson param);

    @POST("customerapi/inserttransaksimerchant")
    Call<RideCarResponseJson> requestTransaksiMerchant(@Body ItemRequestJson param);

    @POST("customerapi/request_transaksi_send")
    Call<SendResponseJson> requestTransaksisend(@Body SendRequestJson param);

    @POST("customerapi/check_status_transaksi")
    Call<CheckStatusTransResponse> checkStatusTransaksi(@Body CheckStatusTransRequest param);

    @POST("customerapi/user_cancel")
    Call<CancelBookResponseJson> cancelOrder(@Body CancelBookRequestJson param);

    @POST("customerapi/liat_lokasi_driver")
    Call<LocationDriverResponse> liatLokasiDriver(@Body LocationDriverRequest param);

    @POST("customerapi/detail_transaksi")
    Call<DetailTransResponseJson> detailtrans(@Body DetailRequestJson param);


}
