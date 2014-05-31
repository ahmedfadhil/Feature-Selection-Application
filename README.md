Feature Selection Application 1.0
==============================
The purpose of the Application:
-In machine learning and statistics, feature selection is the process of selecting a set of relevant features from a data set. This application use the dataset that is stored in a .text file as input, this data contains many redundant and irrelevant features; where redundant features are those which provide repeated information of the currently selected feature, and irrelevant features provide information that are no use for our context. Here the application will choose the subset that minimizes the error rate, then it out puts them as a pair of feature/score per line in a tab separated file, where the score represents the probability for the occurrence of each feature in the dataset.
-This technique is used in areas where the number of features are many and the amount of samples are relatively few.
(For more details please follow the link: http://en.wikipedia.org/wiki/Feature_selection)
Features of the program:
-a Feature Selection application using Pointwise mutual information (PMI) technique.
-No external libraries used for the implementation of a feature selection approach.
-The application is implemented using Java as programming language.
-The application can be run on Unix-like environments (e.g., Mac OS or Debian).
-The code is open source and can be found on GitHub.
(please follow the link:#### ) 
-The file to read the dataset from is in Libsvm format. 
(For more info about Libsvm please follow the link: http://www.csie.ntu.edu.tw/~cjlin/libsvm/)
System requirements:
If you want to run the application on your PC, here’s what it takes:
-1 GHz 32-bit processor
-1GB RAM(32-bit)
-300 KB available hard disk space(32-bit)
How to install, compile and run the application:
The application is implemented using Eclipse for Java EE IDE.
The Steps for installing, compiling and running the application.
-Download the Application from GitHub,
-Import the application to any Eclipse IDE by going to File > Import > Existing projects into Workspace>Select root directory>click “Finish”.
-Once you have the project in your preferred Eclipse directory, then go to – Package Explorer>feature selection application>src>default package>FeatureSelection.java.
-The last step is to compile and run the selected FeatureSelection.java class.
 Files list:
- FeatureSelection.java
- FeatureInstance.java
- FileIO.java
- PMI.java
- StringToFeature.java
- dataset.txt
Known bugs and a change log:
-Non.
