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

▶️ How to Run

Download or clone the project

Open in Android Studio

Let Gradle sync

Connect an Android device or start an emulator

Click Run ▶

<table>
  <tr>
    <td>
      ![WhatsApp Image 2025-11-18 at 11 52 46_c99daa4a](https://github.com/user-attachments/assets/d6af8274-56fb-4a52-8504-f2744e285e6b)
    </td>
    <td>
      ![WhatsApp Image 2025-11-18 at 11 52 46_e1024dbc](https://github.com/user-attachments/assets/5c1419a2-f995-47f1-858d-2f24d466c3d1)
    </td>
    <td>
      ![WhatsApp Image 2025-11-18 at 11 52 47_d468f079](https://github.com/user-attachments/assets/4870c790-a900-4d7b-a5af-6bca0307b8e1)
    </td>
    <td>
      ![WhatsApp Image 2025-11-18 at 11 52 47_cc87dbe1](https://github.com/user-attachments/assets/805c3089-1133-480c-9c78-4ef14cf552c5)
    </td>
  </tr>
</table>

🧩 Future Enhancements

Add images for each dosha

Add signup/register page

Store login credentials

Add Ayurvedic quiz

Add modern UI design

