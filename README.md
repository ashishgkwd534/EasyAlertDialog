[![](https://jitpack.io/v/ashishgkwd534/EasyAlertDialog.svg)](https://jitpack.io/#ashishgkwd534/EasyAlertDialog)
# EasyAlertDialog
Using this library user can easily show alert dialog using single function

# Project set-up
**EasyAlertDialog currently supports API LEVEL 15+**

If you're using a Gradle-based project, then you can add SCV as a dependency directly:

**Step 1:** Add it in your root build.gradle at the end of repositories:
~~~
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
~~~
**Step 2:** Add the dependency
~~~
implementation 'com.github.ashishgkwd534:EasyAlertDialog:Tag'
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
