# MaterialToast
Here comes a little Material Toast library for Android Developers. :smile:
## Add to Gradle
Add this little piece of code of dependency to your build.gradle file under  and you are good to go !

```
implementation 'com.github.Balram02:MaterialToast:-SNAPSHOT'
```
Also add maven support to your project
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
## ScreenShots
<img src="https://github.com/Balram02/MaterialToast/blob/master/Screenshot_MaterialToast-example_20180808-213424.png"
width="280" style="margin:10px;"/>
<img src="https://github.com/Balram02/MaterialToast/blob/master/Screenshot_MaterialToast-example_20180808-213429.png"
width="280" style="margin:10px;"/>
<img src="https://github.com/Balram02/MaterialToast/blob/master/Screenshot_MaterialToast-example_20180808-213753.png"
width="280" style="margin:10px;"/>


## Description
**Method**
```
createToast(int ToastType, String CustomText, int ToastShape)
```
## Use
```
MaterialToast materialToast = new MaterialToast(MainActivity.this,MaterialToast.LENGTH_SHORT);
    materialToast.createToast(MaterialToast.SUCCESS,"Success Material Toast",MaterialToast.SHAPE_DEFAULT);
    materialToast.show();
```
**__NOTE:__** It is inherited from Toast class so all the methods from Toast class are already present.
Made with :heart: by [Balram02](https://github.com/Balram02)
