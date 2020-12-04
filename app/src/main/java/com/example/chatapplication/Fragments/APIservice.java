package com.example.chatapplication.Fragments;

import com.example.chatapplication.Notification.MyResponce;
import com.example.chatapplication.Notification.Sender;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIservice {

        @Headers(

                {
                        "Authorization:keyAAAAiF3eASM:APA91bEJY5sJtjR66sgHaMM8aMR5RaciFCJFMlu77L7Txy8gKfTJiKohmMNh1uUB9N40PypipAmjPHnPdWKuGteVYBeb0fWIQPHXS80ks1ot2pzHJEiugz13g8-Oz6ekT4PtcBoniR-G",
                        "Content-Type:application/json"
                }
        )

        @POST("fcm/send")
                Call <MyResponce> sendNotification(@Body Sender body);


}
