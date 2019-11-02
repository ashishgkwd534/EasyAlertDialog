[![](https://jitpack.io/v/ashishgkwd534/EasyAlertDialog.svg)](https://jitpack.io/#ashishgkwd534/EasyAlertDialog)
# EasyAlertDialog
Using this library user can easily show alert dialog using single function

# Project set-up
**EasyAlertDialog currently supports API LEVEL 15+**

If you're using a Gradle-based project, then you can add SCV as a dependency directly:

~~~
compile 'com.github.amlcurran.showcaseview:library:5.4.3'
~~~

# Usage
To use EasyAlertDialog, use the Builder pattern.

As an example:

**Dialog with only positive button**
```java
EasyAlertDialog.showAlertDialog(this, "Hii", "This is Alert with only positive Button", new EasyAlertDialog.DialogClickListener() {
            @Override
            public void onPositiveButtonClick(DialogInterface dialog, int position) {
                dialog.dismiss();
            }

            @Override
            public void onNegativeButtonClick(DialogInterface dialog) {

            }
        });
```

**Dialog with positive and negative buttons**
```java
EasyAlertDialog.showAlertDialog(this, "Hii", "This is Alert with only positive Button", new EasyAlertDialog.DialogClickListener() {
            @Override
            public void onPositiveButtonClick(DialogInterface dialog, int position) {
                dialog.dismiss();
            }

            @Override
            public void onNegativeButtonClick(DialogInterface dialog) {

            }
        });
```

# Sample Project
There's a sample project available which you can find in the project.
