# MultiProgressBar
<p>A progress bar library for Android that provides <b>customized progress bars.</b></p>
	
[![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](https://github.com/knight-rider1609/MultiProgressBar/blob/master/LICENSE) &nbsp;&nbsp;&nbsp;&nbsp;
[![Android Arsenal]( https://img.shields.io/badge/Android%20Arsenal-MultiProgressBar-green.svg?style=flat )]( https://android-arsenal.com/details/1/7785 )

<div>
  <p align="center">Built with ❤︎ by
	  <a href="https://github.com/knight-rider1609">Aseem Khare</a></p>
</div>

![image](https://github.com/knight-rider1609/MultiProgressBar/blob/master/versatileprogressbar/src/main/res/drawable/bouncy_balls.gif)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
![image](https://github.com/knight-rider1609/MultiProgressBar/blob/master/versatileprogressbar/src/main/res/drawable/clock.gif)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
![image](https://github.com/knight-rider1609/MultiProgressBar/blob/master/versatileprogressbar/src/main/res/drawable/fidget.gif)
</br>
</br>
![image](https://github.com/knight-rider1609/MultiProgressBar/blob/master/versatileprogressbar/src/main/res/drawable/gear_duo.gif)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
![image](https://github.com/knight-rider1609/MultiProgressBar/blob/master/versatileprogressbar/src/main/res/drawable/hour_glass.gif)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
![image](https://github.com/knight-rider1609/MultiProgressBar/blob/master/versatileprogressbar/src/main/res/drawable/jelly_belly.gif)
</br>
</br>
![image](https://github.com/knight-rider1609/MultiProgressBar/blob/master/versatileprogressbar/src/main/res/drawable/infinity_bar.gif)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
![image](https://github.com/knight-rider1609/MultiProgressBar/blob/master/versatileprogressbar/src/main/res/drawable/rainbow_ring.gif)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
![image](https://github.com/knight-rider1609/MultiProgressBar/blob/master/versatileprogressbar/src/main/res/drawable/triad_ring.gif)
</br>
</br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;![image](https://github.com/knight-rider1609/MultiProgressBar/blob/master/versatileprogressbar/src/main/res/drawable/color_capsule.gif)
## 💻 Installation
Add this in your app's build.gradle file:
```groovy
dependencies {
  implementation 'com.aseem.versatileprogressbar:MultiProgressBar:1.1.1'
}
```
## ❔ Usage
**Basic Usage**
</br>
Minimum SDk version required:23

Put the following at the bottom of your activity layout xml file. Probably inside a parent Relative Layout tag.

``` 
 	<com.aseem.versatileprogressbar.ProgBar
        android:id="@+id/myProgBar"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
	android:elevation="10dp"
        app:barType="@drawable/bouncy_balls"
        app:text="Please wait..."          
        app:textSize="6sp"		   
        app:enlarge="3"			     
        app:androidtextColor="@color/colorPrimary"/> 

```
**Description**

<table>
    <th>Attribute Name</th>
    <th>Default Value</th>
    <th>Description</th>
	<tr>
		<td>app:barType </td>
		<td>bouncy_balls</td>
		<td>Defines the design of progress bar. All the available designs are mentioned below.</td>
	</tr>
		<tr>
		<td>app:text </td>
		<td>Please wait...</td>
		<td>The text you want to show below the progress bar.</td>
	</tr>
		<tr>
		<td> app:textSize </td>
		<td>16sp</td>
		<td>The size of text you want.</td>
	</tr>
		<tr>
		<td>app:enlarge </td>
		<td>2</td>
		<td>This can range from 1 to 10 and enalrges the size of the progress bar.</td>
	</tr>
		<tr>
		<td>app:androidtextColor </td>
		<td>BLACK</td>
		<td>This is the color of the text.</td>
	</tr>
	</table>
	
**Progress Bar Designs**


``` 
        app:barType="@drawable/bouncy_balls"
	app:barType="@drawable/clock"
	app:barType="@drawable/color_capsule"
	app:barType="@drawable/fidget"
	app:barType="@drawable/gear_duo"
	app:barType="@drawable/hour_glass"
	app:barType="@drawable/infinity_bar"
	app:barType="@drawable/jelly_belly"
	app:barType="@drawable/rainbow_ring"
	app:barType="@drawable/triad_ring"
```

## 🎨 Customization and Attributes

You can programatically customize the progress bar using the following methods:
<table>
    <th>Method Name</th>
    <th>Description</th>
    <th>Usage</th>
		<tr>
			<td>setScaleType()</td>
			<td>To set the scale type of progress bar. Default is centerInside.</td>
			<td>myProgBar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);</td>
		</tr>
		<tr>
			<td>setProgressVector()</td>
			<td>To set the design of progress bar. All the available designs are mentioned above.</td>
			<td>myProgBar.setProgressVector(getDrawable(R.drawable.bouncy_balls));</td>
		</tr>
		<tr>
			<td>enlarge()</td>
			<td>This can range from 1 to 10 and enalrges the size of the progress bar.</td>
			<td>myProgBar.enlarge(4);</td>
		</tr>
		<tr>
			<td>setTextMsg()</td>
			<td>The text you want to show below the progress bar.</td>
			<td>myProgBar.setTextMsg("Loading");</td>
		</tr>
		<tr>
			<td>setTextColor()</td>
			<td>This sets the color of the text below the progress bar.</td>
			<td>myProgBar.setTextColor(getColor(R.color.colorPrimary));</td>
		</tr>
		<tr>
			<td>setTextSize()</td>
			<td>This sets the size of the text below the progress bar.</td>
			<td>myProgBar.setTextSize(24);</td>
		</tr>
	</table>
	
# 📃 License

    Copyright 2019 Aseem Khare

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

### If you like the library, please click on the ★ Star button at the top 😊
