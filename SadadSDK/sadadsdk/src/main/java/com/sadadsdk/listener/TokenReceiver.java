package com.sadadsdk.listener;

import java.io.Serializable;

public interface TokenReceiver extends Serializable {

    void onCheckSumReceived(String checkSum);

    void onCheckSumFailed(String errorMsg);

    void onCreateTransaction(String data);

    void onTransactionFailed(String errorMsg);

    void onPatchTransaction(String data);

    void onPatchTransactionFailed(String errorMsg);

    void onSadadCall(String data);
}
