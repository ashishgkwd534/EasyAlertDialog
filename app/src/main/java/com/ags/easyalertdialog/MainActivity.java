package com.ags.easyalertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import com.ags.easyalertdialoglibrary.EasyAlertDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showAlert(View view) {
        EasyAlertDialog.showAlertDialog(this, "Hii", "This is Alert with only positive Button", new EasyAlertDialog.DialogClickListener() {
            @Override
            public void onPositiveButtonClick(DialogInterface dialog, int position) {
                dialog.dismiss();
            }

            @Override
            public void onNegativeButtonClick(DialogInterface dialog) {

            }
        });
    }

    public void showNegativeAlert(View view) {
        EasyAlertDialog.showAlertDialog(this, "Hii", "This is Alert with positive and negative Buttons", "Yes! I did it",
                "close", new EasyAlertDialog.DialogClickListener() {
                    @Override
                    public void onPositiveButtonClick(DialogInterface dialog, int position) {
                        dialog.dismiss();
                    }

                    @Override
                    public void onNegativeButtonClick(DialogInterface dialog) {
                        dialog.dismiss();
                    }
                });
    }
}
