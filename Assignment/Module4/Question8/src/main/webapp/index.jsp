<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>WhatsApp Web Template</title>
  <style type="text/css">
 /* General Reset */
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

body {
  font-family: Arial, sans-serif;
  background-color: #121212;
  color: #d1d1d1;
}

.container {
  display: flex;
  height: 100vh;
  overflow: hidden;
}

/* Sidebar */
.sidebar {
  width: 35%;
  background-color: #202c33;
  display: flex;
  flex-direction: column;
}

.sidebar-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 1rem;
  background-color: #2a3942;
}

.sidebar-title {
  font-size: 1.5rem;
  color: white;
}

.notification-badge {
  background-color: #25d366;
  color: white;
  padding: 0.4rem 0.8rem;
  font-size: 0.8rem;
  border-radius: 50%;
}

.search-bar {
  padding: 0.8rem;
  background-color: #2a3942;
}

.search-bar input {
  width: 100%;
  padding: 0.6rem;
  border: none;
  border-radius: 5px;
  background-color: #202c33;
  color: #d1d1d1;
}

.filters {
  display: flex;
  justify-content: space-around;
  padding: 0.5rem 0;
  background-color: #2a3942;
}

.filter {
  background: none;
  border: none;
  color: white;
  padding: 0.5rem 1rem;
  cursor: pointer;
}

.filter.active {
  color: #25d366;
  font-weight: bold;
}

.chat-list {
  flex-grow: 1;
  overflow-y: auto;
}

.chat-item {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 1rem;
  border-bottom: 1px solid #2a3942;
  cursor: pointer;
}

.chat-item:hover {
  background-color: #182229;
}

.chat-details {
  flex: 1;
}

.chat-name {
  font-weight: bold;
  color: white;
}

.chat-message {
  font-size: 0.9rem;
  color: #b0b0b0;
}

.chat-time, .chat-badge {
  color: #25d366;
  font-size: 0.9rem;
  text-align: right;
}

/* Main Content */
.main-content {
  flex-grow: 1;
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: #131c21;
  color: white;
  text-align: center;
}

.content-wrapper {
  max-width: 500px;
}

.hero-image {
  width: 150px;
  margin-bottom: 1rem;
}

.main-content h1 {
  font-size: 1.8rem;
  margin-bottom: 1rem;
}

.main-content p {
  margin-bottom: 1.5rem;
}

.main-content button {
  padding: 0.8rem 1.5rem;
  background-color: #009688;
  color: white;
  border: none;
  border-radius: 5px;
  cursor: pointer;
}

.main-content button:hover {
  background-color: #00796b;
}

  
  </style>
</head>
<body>
  <div class="container">
  <!-- Sidebar -->
  <div class="sidebar">
    <!-- User Info -->
    <div class="user-info">
      
      <div class="user-details">
        <div class="user-name">John Doe</div>
      </div>
    </div>

    <!-- Header -->
    <div class="sidebar-header">
      <div class="sidebar-title">Chats</div>
      <div class="notification-badge">91</div>
    </div>

    <!-- Search Bar -->
    <div class="search-bar">
      <input type="text" placeholder="Search" />
    </div>

    <!-- Filter Buttons -->
    <div class="filters">
      <button class="filter active">All</button>
      <button class="filter">Unread</button>
      <button class="filter">Favourites</button>
      <button class="filter">Groups</button>
    </div>

    <!-- Chat List -->
    <div class="chat-list">
      <div class="chat-item">
        <div class="chat-details">
          <div class="chat-name">Batch_Java 2:00 to 3:30 (tts)</div>
          <div class="chat-message">~ Parag Mehta: Ma'am shift on Monday...</div>
        </div>
        <div class="chat-time">14:53</div>
      </div>
      <!-- Additional chat items go here -->
    </div>
  </div>

  <!-- Main Content -->
  <div class="main-content">
    <div class="content-wrapper">
      <img src="whatsapp-logo.png" alt="WhatsApp Logo" class="hero-image">
      <h1>Download</h1>
      <p>Make calls, share your screen, and get a faster experience when you download the Windows app.</p>
      <button>Get from Microsoft Store</button>
    </div>
  </div>
</div>

</body>
</html>
