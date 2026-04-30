# 🎓 Simple Student Profile Manager

A simple and user-friendly **Android application** built with **Java in Android Studio** for managing student profiles efficiently. This app demonstrates basic Android development concepts including **Activities, Intent Data Passing, UI Design, and Profile Management**.

## 📱 Features

✅ User Login System
✅ Dashboard Screen
✅ View Student Profile
✅ Edit & Update Profile Information
✅ Data Passing Between Activities using Intent
✅ Clean and Simple User Interface
✅ Beginner-Friendly Android Project

---

## 🛠️ Built With

* **Java**
* **Android Studio**
* **XML Layout Design**
* **Intent (Data Passing)**
* **Android SDK**

---

## 📂 Project Flow

Login → Dashboard → Profile View → Edit Profile

### Activity Description

### 1️⃣ Login Activity

* User enters Student/User ID
* Login button redirects to Dashboard
* Passes User ID through Intent

### 2️⃣ Dashboard Activity

* Main navigation screen
* Opens Student Profile
* Receives and forwards profile data

### 3️⃣ Profile Activity

* Displays student details:

  * Name
  * ID
  * Department
  * Email
* Edit Profile button available

### 4️⃣ Edit Profile Activity

* Allows updating profile information
* Saves changes
* Passes updated data back

---

## 🔄 Data Passing

This project uses **Intent Extras** to pass data between activities:

```java
Intent intent = new Intent(this, ProfileActivity.class);
intent.putExtra("userId", userId);
startActivity(intent);
```

Receiving data:

```java
String userId = getIntent().getStringExtra("userId");
```

---

## 📸 Screenshots

Add screenshots here:

* Login Screen
* Dashboard
* Profile View
* Edit Profile

Example:

```md
![Login](screenshots/login.png)
![Dashboard](screenshots/dashboard.png)
```

---

## 🚀 How to Run

1. Clone the repository:

```bash
git clone https://github.com/nasim-dev0459/Simple-Student-Profile-Manager.git
```

2. Open in Android Studio

3. Sync Gradle Files

4. Run on Emulator / Android Device

---

## 🎯 Learning Purpose

This project is suitable for beginners learning:

* Android Activity Lifecycle
* Java for Android
* Intent & Data Passing
* XML UI Design
* Simple CRUD-style profile update logic

---

## 🤝 Contributing

Contributions, suggestions, and improvements are welcome.

Feel free to Fork this repository and create a Pull Request.

---

## 👨‍💻 Author

**Md Nasim Hawlader**

GitHub: [@nasim-dev0459](https://github.com/topics/profile-management?utm_source=chatgpt.com)

---

## ⭐ Support

If you like this project, give it a **Star ⭐** on GitHub.

---

### Made with ❤️ using Java & Android Studio
