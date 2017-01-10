# RootChecker
Simple library to check root on your device

# Usage
To check root on your device and add RootChecker library in your project or you can also grab it via Gradle:

Add it in your build.gradle at the end of repositories:

    allprojects {
        repositories {
            ...
            maven { url 'https://jitpack.io' }

        }
    }

Add depencies :

    dependencies {
        compile 'com.github.iksandecade:Root-Checker:1.0.1'
    }

# How To Use

To use this library is very simple. Just add this code in your class to know your device is rooted or not

    if(RootChecker.isRooted(){
        // your device is rooted
    } else{
        // your device not rooted
    }

or you can simply bring up the dialog like this

![](https://s30.postimg.org/h3ypaqls1/Screenshot_2017_01_10_10_49_28.png)

To show the dialog just add this code

    //in Activity class
    RootChecker.checkRoot(this);

    //in Fragment class
    RootChecker.checkRoot(getActivity);

Very simple na?

# Version
this library version is 1.0.1
I will update this library sometimes

# Licence

Copyright 2017 IKSANDECADE

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.`
