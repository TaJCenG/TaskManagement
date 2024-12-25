# TaskManagement
This branch implements the foundational features of the Task Management System, including database entities, REST API endpoints, test data population, Postman testing collections, and basic frontend integration. It is a comprehensive branch to establish the project's core functionality.

# Task Management System  

## Project Overview  
This project provides a task management system for handling tasks across various verticals, including:  
- UI Team  
- Backend Team  
- Marketing and Sales  
- Calling Teams  

The system includes both web and mobile application interfaces, supported by robust backend APIs and a relational database.

---

## Features Implemented in this Branch  
1. **Database Entities**:  
   - `Roles`, `Users`, `Tasks`, and `Notifications` tables with relationships.  
2. **REST APIs**:  
   - CRUD operations for users, roles, tasks, and notifications.  
   - Secure access control with role-based assignments.  
3. **Test Data Population**:  
   - SQL scripts and JPA methods for populating roles, users, and tasks.  
4. **Postman Testing**:  
   - Postman collection with test cases for all APIs.  
5. **Frontend Integration**:  
   - Initial UI screens for login, dashboards, and task management.

---

## Tech Stack  
1. **Backend**:  
   - Java 17, Spring Boot 3.3.6, Maven.  
2. **Frontend**:  
   - React 17.0.2, JavaScript, Tailwind CSS.  
3. **Database**:  
   - MySQL 8.x.  
4. **Version Control**:  
   - GitLab/GitHub for version management.

---

## Branch Structure  
1. **Backend**  
   - `/src/main/java/...`  
   - `/src/test/java/...`  
2. **Frontend**  
   - `/web-ui/...`  
   - `/app-ui/...`  
3. **Database Scripts**  
   - `/db-scripts/...`  
4. **Testing**  
   - `/postman-collections/...`

---

## How to Run the Project  

### Backend  
1. Navigate to the `backend/` folder.  
2. Run the following command to start the application:  
   ```bash
   mvn spring-boot:run
