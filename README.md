# 🐞 Bug Tracker System

## 📌 Overview

This is a full-stack **Bug Tracking System** built using **Spring Boot**.
It allows users to create, view, update, and delete bugs through a simple and interactive UI.

---

## 🚀 Features

* ➕ Add new bugs
* 📋 View all bugs
* 🔄 Update bug status (OPEN / IN_PROGRESS / CLOSED)
* ❌ Delete bugs
* 🎨 Simple and responsive UI

---

## 🛠️ Tech Stack

* **Backend:** Java, Spring Boot
* **Database:** H2 (in-memory)
* **Frontend:** HTML, CSS, JavaScript
* **API Testing:** Postman

---

## 🔗 API Endpoints

| Method | Endpoint     | Description       |
| ------ | ------------ | ----------------- |
| GET    | `/bugs`      | Fetch all bugs    |
| POST   | `/bugs`      | Create a new bug  |
| PUT    | `/bugs/{id}` | Update bug status |
| DELETE | `/bugs/{id}` | Delete a bug      |

---

## ▶️ How to Run Locally

1. Clone the repository:

```bash
git clone https://github.com/your-username/bug-tracker-system.git
```

2. Navigate to project folder:

```bash
cd bug-tracker-system
```

3. Run the application:

* Open `DemoApplication.java`
* Click **Run ▶️**

4. Open in browser:

```
http://localhost:8036
```

---

## 📸 Output Screenshots

### 🖥️ UI Interface

<img width="709" height="429" alt="image" src="https://github.com/user-attachments/assets/7d1987ab-3667-45f8-ab0c-ad42856db72b" />


### ➕ Adding a Bug

<img width="725" height="548" alt="image" src="https://github.com/user-attachments/assets/cab118d3-bd38-4768-a46b-6cd721f00969" />


### 🔄 Updating Status

<img width="728" height="471" alt="image" src="https://github.com/user-attachments/assets/1e78b507-9d4a-4915-8353-92af59a1a968" />
<img width="757" height="539" alt="image" src="https://github.com/user-attachments/assets/1848ca00-aa7b-4ded-8ed9-8a9bee68d598" />


### ❌ Deleting a Bug

<img width="733" height="532" alt="image" src="https://github.com/user-attachments/assets/58f203c0-5ebd-484b-a514-ef78d4cf235f" />
<img width="724" height="435" alt="image" src="https://github.com/user-attachments/assets/c99a9ba9-5a75-47b4-8afe-229d864692da" />


---

## 💡 How It Works

* Users enter a bug in the UI
* The frontend sends requests to the backend via REST APIs
* The backend processes and stores data in H2 database
* Updated data is displayed dynamically on the UI

---

## 🎯 Future Improvements

* User authentication (login system)
* Assign bugs to users
* Add priority levels
* Persistent database (MySQL)

---

## 👩‍💻 Author
Kalpana Kumari Marrapu
