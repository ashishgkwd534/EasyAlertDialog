package com.ags.easyalertdialoglibrary;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

import androidx.annotation.NonNull;

/**
* Created by: Ashish Gaikwad (@Ashish)
* Created on: 02-11-2019:09:55 PM
*/
public class EasyAlertDialog {
    public static DialogClickListener dialogClickListner;
    public static void showAlertDialog(@NonNull Context context,@NonNull String title, @NonNull String message,
                                     @NonNull final DialogClickListener dialogClickListener){
        new AlertDialog.Builder(context)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialogClickListener.onPositiveButtonClick(dialog,which);
                    }
                }).setCancelable(false)
                .show();


    }
    public static void showAlertDialog(@NonNull Context context,@NonNull String title, @NonNull String message,@NonNull String positiveButtonName,
                                       @NonNull String negativeButtonName,
                                       @NonNull final DialogClickListener dialogClickListener){
        new AlertDialog.Builder(context)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton(positiveButtonName, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialogClickListener.onPositiveButtonClick(dialog,which);
                    }
                })
                .setNegativeButton(negativeButtonName, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialogClickListener.onNegativeButtonClick(dialog);
                    }
                })
                .setCancelable(false)
                .show();


    }
    public interface DialogClickListener {
        void onPositiveButtonClick(DialogInterface dialog, int position);
        void onNegativeButtonClick(DialogInterface dialog);

    }

}
