# MultiProgressBar
<p>A progress bar library for Android that provides <b>customized progress bars.</b></p>
	
[![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](https://github.com/knight-rider1609/MultiProgressBar/blob/master/LICENSE)

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
  implementation 'com.aseem.versatileprogressbar:MultiProgressBar:1.1.0'
}
```
## ❔ Usage
**Basic Usage**
</br>
Put the following at the bottom of your activity layout xml file. Probably inside a parent Relative Layout tag.

``` 
 	<com.aseem.versatileprogressbar.ProgBar
        android:id="@+id/myProgBar"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
	android:elevation="10dp"
        app:barType="@drawable/bouncy_balls"
        app:text="Please wait..."          
        app:textSize="18sp"		   
        app:enlarge="3"			     
        app:androidtextColor="@color/colorPrimary"/> 

```
##Description
<table>
    <th>Attribute Name</th>
    <th>Default Value</th>
    <th>Description</th>
	<tr>
		<td>app:barType="@drawable/bouncy_balls" </td>
		<td>bouncy_balls</td>
		<td>Defines the design of progress bar. All the available designs are mentioned below.</td>
	</tr>
		<tr>
		<td>app:text </td>
		<td>Please wait...</td>
		<td>The text you want to show below the progress bar</td>
	</tr>
		<tr>
		<td> app:textSize </td>
		<td>16sp</td>
		<td>The size of text you wan</td>
	</tr>
		<tr>
		<td>app:enlarge </td>
		<td>2</td>
		<td>This can range from 1 to 10 and enalrges the size of the progress bar</td>
	</tr>
		<tr>
		<td>app:androidtextColo </td>
		<td>BLACK</td>
		<td>This is the color of the text</td>
	</tr>
	</table>

