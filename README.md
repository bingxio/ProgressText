# ProgressText
一个带动画效果的文字进度条

## Demo
![](https://github.com/Turaiiao/ProgressText/blob/master/img/1518011152249mz2.gif)

## 引用
#### 第一步
添加依赖到项目根目录的 build.gradle

```
allprojects {
	repositories {
		...
		maven { url 'https://www.jitpack.io' }
	}
}
```
#### 第二步
包含此库到 ``app`` 级别的 build.gradle

```
dependencies {
	compile 'com.github.Turaiiao:ProgressText:0.0.2'
}
```
## 使用
#### XML
```xml
<cn.xyiio.progresstext.view.ProgressText
	android:id="@+id/progressText"
        android:layout_width="180dp"
        android:layout_height="wrap_content" />
```
##### 注意
* 这个 View 本身继承 RelativeLayout，需要设置 layout_width 才能显示
* layout 里没有其他的属性，则需要在 Java 代码里设置

#### Java
```java
ProgressText progressText = (ProgressText) findViewById(R.id.progressText);

progressText.setHeadText("已坚持");
progressText_a.startSetTextAnimation(12, 30);
progressText_a.setBottomText("天");
```
##### 注意
![](https://github.com/Turaiiao/ProgressText/blob/master/img/IMG_20180207_215758.jpg)
* 这串代码效果如上图，左边的文字为 ``HeadText``，中间的12为 ``StartText``，分割线为 ``LineText``，右边结束的文字为 ``EndText``，最后的文字为 ``BottomText``，每一个都可以自定义颜色，字体大小。文字等
##### 全部属性
HeadText | 作用 | StartText | 作用 | LineText | 作用 | EndText | 作用 | BottomText | 作用
----|----|----|----|----|----|----|----|----|----
foo | foo | foo
bar | bar | bar
baz | baz | baz
