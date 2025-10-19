# QuizApp – Android Quiz Application

**QuizApp** is an Android application designed to help users test and improve their programming knowledge through interactive multiple-choice quizzes. The app supports various programming languages including Java, Kotlin, C++, C#, and more, with real-time result tracking.

--
## Features

- **User Authentication:** Secure **login and signup** using Firebase Authentication.
- **Quiz Categories:** Multiple-choice quizzes for **Java, Kotlin, C++, C#, etc.**
- **Progress Tracking:** Displays a **progress bar** to show quiz completion and scores.
- **Navigation:** Smooth and intuitive navigation between screens:
   - Signup → Login → Home → Quiz Categories → Quiz Questions → Results
   - Users can return to Home or select a new quiz category after completing a quiz.
- **Realtime Database:** Store user details, quiz scores, and progress using **Firebase Realtime Database**.
- **User-Friendly Interface:** Clean and interactive UI with Material Design principles.

---

## Technologies Used

- **Programming Languages:** Java (Login & Firebase integration), Kotlin (Quiz logic)
- **Database & Backend:** Firebase Authentication, Firebase Realtime Database
- **Development Environment:** Android Studio
- **UI/UX:** XML layouts with Material Design components

---

## Installation & Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/nimra-ijaz1/QuizApp.git
````
2. **Open the project in Android Studio:**
   `File → Open → Select project folder`
3. **Configure Firebase:**

    * Create a Firebase project.
    * Add your Android app to Firebase.
    * Download `google-services.json` and place it in the `app/` directory.
4. **Build and Run:** Use an emulator or physical Android device to run the app.

---

## Screenshots
![background](https://raw.githubusercontent.com/nimra-ijaz1/QuizApp/main/app/src/main/res/drawable/background.png)
![boy](https://raw.githubusercontent.com/nimra-ijaz1/QuizApp/main/app/src/main/res/drawable/boy.png)
![clanguage](https://raw.githubusercontent.com/nimra-ijaz1/QuizApp/main/app/src/main/res/drawable/clanguage.png)
![coding](https://raw.githubusercontent.com/nimra-ijaz1/QuizApp/main/app/src/main/res/drawable/coding.png)
![cplus](https://raw.githubusercontent.com/nimra-ijaz1/QuizApp/main/app/src/main/res/drawable/cplus.png)
![csharp](https://raw.githubusercontent.com/nimra-ijaz1/QuizApp/main/app/src/main/res/drawable/csharp.png)
![dart](https://raw.githubusercontent.com/nimra-ijaz1/QuizApp/main/app/src/main/res/drawable/dart.png)
![google](https://raw.githubusercontent.com/nimra-ijaz1/QuizApp/main/app/src/main/res/drawable/google.png)
![html](https://raw.githubusercontent.com/nimra-ijaz1/QuizApp/main/app/src/main/res/drawable/html.png)
![insta](https://raw.githubusercontent.com/nimra-ijaz1/QuizApp/main/app/src/main/res/drawable/insta.png)
![java](https://raw.githubusercontent.com/nimra-ijaz1/QuizApp/main/app/src/main/res/drawable/java.png)
![ok](https://raw.githubusercontent.com/nimra-ijaz1/QuizApp/main/app/src/main/res/drawable/ok.png)
![python](https://raw.githubusercontent.com/nimra-ijaz1/QuizApp/main/app/src/main/res/drawable/python.png)
![splash_image](https://raw.githubusercontent.com/nimra-ijaz1/QuizApp/main/app/src/main/res/drawable/splash_image.jpeg)
![kotlin](https://raw.githubusercontent.com/nimra-ijaz1/QuizApp/main/app/src/main/res/drawable/kotlin.png)
![na](https://raw.githubusercontent.com/nimra-ijaz1/QuizApp/main/app/src/main/res/drawable/na.png)
![menubutton](https://raw.githubusercontent.com/nimra-ijaz1/QuizApp/main/app/src/main/res/drawable/menubutton.png)
![linkedin_logo](https://raw.githubusercontent.com/nimra-ijaz1/QuizApp/main/app/src/main/res/drawable/linkedin_logo.png)

 ## Navigation Flow
```text
Signup → Login → Home → Quiz Categories → Quiz Questions → Results
          ↘---------------------------↗
```

* Users start by signing up or logging in.
* Navigate to Home to select quiz categories.
* After completing quizzes, results are shown with progress bars.
* Users can return to Home to choose a new quiz.

---

## Author

* **Nimra Ijaz**
* BS Software Engineering, PMAS-AAUR, UIIT Campus
## Acknowledgements

* Firebase documentation for authentication and database integration
* Material Design for Android UI guidelines
* Inspiration from popular language and coding quiz apps


