📱 Ayurvedic Diet Assistant — Android App (Kotlin)

This is a simple Android application built using Kotlin in Android Studio.
The app includes:

✔ A Login Page

✔ A Dosha Diet Page with buttons

✔ Displays recommended foods for Vata, Pitta, and Kapha

✔ Clean and beginner-friendly code

🚀 Features
🔐 Login Page

User can enter any username and any password

After clicking Login, user is taken to the main screen

🍃 Ayurvedic Dosha Diet Page

Three buttons:

Vata Foods

Pitta Foods

Kapha Foods

Clicking a button shows a short list of recommended foods

🛠️ Tech Stack
Component	Technology
Language	Kotlin
IDE	Android Studio
UI Layout	XML
Target	Android ≥ API 21
📁 Project Structure
app/
├── manifests/
│   └── AndroidManifest.xml
├── java/
│   └── com.example.ayurvedicdiet/
│       ├── LoginActivity.kt
│       └── MainActivity.kt
└── res/
    ├── layout/
    │   ├── activity_login.xml
    │   └── activity_main.xml
    └── mipmap/

📄 Code Summary
LoginActivity

Reads username & password

Allows login with any values

Navigates to MainActivity

MainActivity

Contains buttons for each dosha type

Displays foods in a TextView

Output :

Download or clone the project

Open in Android Studio

Let Gradle sync

Connect an Android device or start an emulator

Output :

<table>
  <tr>
    <td>
    <img width="385" height="827" alt="image" src="https://github.com/user-attachments/assets/8dbf89a1-bc03-45d5-b260-535c6029bdb7" />
    </td>
    <td>
    <img width="368" height="678" alt="image" src="https://github.com/user-attachments/assets/d92d0d14-459b-4445-aae1-b683a85e81a8" />
    </td>
    <td>
     <img width="389" height="670" alt="image" src="https://github.com/user-attachments/assets/fb8ea86b-5dcc-47c9-9637-d3c5ebb22eb2" />
    </td>
    <td>
    <img width="381" height="714" alt="image" src="https://github.com/user-attachments/assets/28ca26e2-41e3-40c0-8224-63c1fdbd01d6" />
    </td>
  </tr>
</table>

🧩 Future Enhancements

Add images for each dosha

Add signup/register page

Store login credentials

Add Ayurvedic quiz

Add modern UI design

