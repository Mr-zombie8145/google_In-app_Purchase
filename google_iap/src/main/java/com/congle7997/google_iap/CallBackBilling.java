package com.congle7997.google_iap;

import java.util.HashMap;

public interface CallBackBilling {
    void onPurchase();
    void onNotPurchase();
    void onNotLogin();
}
