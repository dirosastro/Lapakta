package com.samarkaton.lapakta.utils.api.service;

import com.samarkaton.lapakta.json.AllMerchantByNearResponseJson;
import com.samarkaton.lapakta.json.AllMerchantbyCatRequestJson;
import com.samarkaton.lapakta.json.AllTransResponseJson;
import com.samarkaton.lapakta.json.BankResponseJson;
import com.samarkaton.lapakta.json.NewsDetailRequestJson;
import com.samarkaton.lapakta.json.NewsDetailResponseJson;
import com.samarkaton.lapakta.json.ChangePassRequestJson;
import com.samarkaton.lapakta.json.DetailRequestJson;
import com.samarkaton.lapakta.json.EditprofileRequestJson;
import com.samarkaton.lapakta.json.GetAllMerchantbyCatRequestJson;
import com.samarkaton.lapakta.json.GetServiceResponseJson;
import com.samarkaton.lapakta.json.GetHomeRequestJson;
import com.samarkaton.lapakta.json.GetHomeResponseJson;
import com.samarkaton.lapakta.json.GetMerchantbyCatRequestJson;
import com.samarkaton.lapakta.json.LoginRequestJson;
import com.samarkaton.lapakta.json.LoginResponseJson;
import com.samarkaton.lapakta.json.MerchantByCatResponseJson;
import com.samarkaton.lapakta.json.MerchantByIdResponseJson;
import com.samarkaton.lapakta.json.MerchantByNearResponseJson;
import com.samarkaton.lapakta.json.MerchantbyIdRequestJson;
import com.samarkaton.lapakta.json.PrivacyRequestJson;
import com.samarkaton.lapakta.json.PrivacyResponseJson;
import com.samarkaton.lapakta.json.PromoRequestJson;
import com.samarkaton.lapakta.json.PromoResponseJson;
import com.samarkaton.lapakta.json.RateRequestJson;
import com.samarkaton.lapakta.json.RateResponseJson;
import com.samarkaton.lapakta.json.RegisterRequestJson;
import com.samarkaton.lapakta.json.RegisterResponseJson;
import com.samarkaton.lapakta.json.ResponseJson;
import com.samarkaton.lapakta.json.SearchMerchantbyCatRequestJson;
import com.samarkaton.lapakta.json.StripeRequestJson;
import com.samarkaton.lapakta.json.TopupRequestJson;
import com.samarkaton.lapakta.json.TopupResponseJson;
import com.samarkaton.lapakta.json.WalletRequestJson;
import com.samarkaton.lapakta.json.WalletResponseJson;
import com.samarkaton.lapakta.json.WithdrawRequestJson;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Ourdevelops Team on 10/13/2019.
 */

public interface UserService {

    @POST("customerapi/login")
    Call<LoginResponseJson> login(@Body LoginRequestJson param);

    @POST("customerapi/kodepromo")
    Call<PromoResponseJson> promocode(@Body PromoRequestJson param);

    @POST("customerapi/listkodepromo")
    Call<PromoResponseJson> listpromocode(@Body PromoRequestJson param);

    @POST("customerapi/list_bank")
    Call<BankResponseJson> listbank(@Body WithdrawRequestJson param);

    @POST("customerapi/changepass")
    Call<LoginResponseJson> changepass(@Body ChangePassRequestJson param);

    @POST("customerapi/register_user")
    Call<RegisterResponseJson> register(@Body RegisterRequestJson param);

    @GET("customerapi/detail_fitur")
    Call<GetServiceResponseJson> getFitur();

    @POST("customerapi/forgot")
    Call<LoginResponseJson> forgot(@Body LoginRequestJson param);

    @POST("customerapi/privacy")
    Call<PrivacyResponseJson> privacy(@Body PrivacyRequestJson param);

    @POST("customerapi/home")
    Call<GetHomeResponseJson> home(@Body GetHomeRequestJson param);

    @POST("customerapi/topupstripe")
    Call<TopupResponseJson> topup(@Body TopupRequestJson param);

    @POST("customerapi/stripeaction")
    Call<ResponseJson> actionstripe(@Body StripeRequestJson param);

    @POST("customerapi/intentstripe")
    Call<ResponseJson> intentstripe(@Body StripeRequestJson param);

    @POST("customerapi/withdraw")
    Call<ResponseJson> withdraw(@Body WithdrawRequestJson param);

    @POST("customerapi/topuppaypal")
    Call<ResponseJson> topuppaypal(@Body WithdrawRequestJson param);

    @POST("customerapi/rate_driver")
    Call<RateResponseJson> rateDriver(@Body RateRequestJson param);

    @POST("customerapi/edit_profile")
    Call<RegisterResponseJson> editProfile(@Body EditprofileRequestJson param);

    @POST("customerapi/wallet")
    Call<WalletResponseJson> wallet(@Body WalletRequestJson param);

    @POST("customerapi/history_progress")
    Call<AllTransResponseJson> history(@Body DetailRequestJson param);

    @POST("customerapi/detail_berita")
    Call<NewsDetailResponseJson> beritadetail(@Body NewsDetailRequestJson param);

    @POST("customerapi/all_berita")
    Call<NewsDetailResponseJson> allberita(@Body NewsDetailRequestJson param);

    @POST("customerapi/merchantbykategoripromo")
    Call<MerchantByCatResponseJson> getmerchanbycat(@Body GetMerchantbyCatRequestJson param);

    @POST("customerapi/merchantbykategori")
    Call<MerchantByNearResponseJson> getmerchanbynear(@Body GetMerchantbyCatRequestJson param);

    @POST("customerapi/allmerchantbykategori")
    Call<AllMerchantByNearResponseJson> getallmerchanbynear(@Body GetAllMerchantbyCatRequestJson param);

    @POST("customerapi/itembykategori")
    Call<MerchantByIdResponseJson> getitembycat(@Body GetAllMerchantbyCatRequestJson param);

    @POST("customerapi/searchmerchant")
    Call<AllMerchantByNearResponseJson> searchmerchant(@Body SearchMerchantbyCatRequestJson param);

    @POST("customerapi/allmerchant")
    Call<AllMerchantByNearResponseJson> allmerchant(@Body AllMerchantbyCatRequestJson param);

    @POST("customerapi/merchantbyid")
    Call<MerchantByIdResponseJson> merchantbyid(@Body MerchantbyIdRequestJson param);


}
