# RecyclerViewDemo
Android recyclerview demo project

Gradle
```
dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    androidTestCompile('com.android.support.test.espresso:espresso-core:2.2.2', {
        exclude group: 'com.android.support', module: 'support-annotations'
    })
    compile 'com.android.support:appcompat-v7:24.2.1'
    compile 'com.android.support:recyclerview-v7:24.2.1'
    compile 'com.squareup.picasso:picasso:2.5.2'
    compile 'com.squareup.okhttp3:okhttp:3.5.0'
    testCompile 'junit:junit:4.12'
}
```
DataModel.java
```java
public class DataModel {
    public String image;
    public String yazi;

    public DataModel(String image , String yazi){
        this.image = image;
        this.yazi = yazi;
    }
 }
```
