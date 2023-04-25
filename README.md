# Chatroom using java and java.swing
#21-04-2023

Abstract
This report discuss the development of java project named Chatroom. The Chatroom has a client and server named Goku and Shubh. The chatroom allows user to communicate with each other in real-time using java Socket API and Swing library. The server manages the connections and communication between clients , while the client connects server and sends and receive messages.  The chatroom GUI consists of a text area with background pic to display incoming and outgoing messages ,A text field to enter outgoing messages , a button to send messages to server . The chatroom also has panel for profile picture, calling and status. The Chatroom can be further improved by implementing features such as file Sharing , private messaging , login page and user authentication. Overall the development of this Java mini project Chatroom was a great experience and a good opportunity to learn java and java swing library.


Introduction

A chatroom is an online platform where users can communicate with each other in real-time. The Java programming language provides a rich set of libraries and tools to build networked applications such as chatrooms. In this report, we will discuss the development of a Java program chatroom with a client and server.
Server-side:

The server-side of the chatroom is responsible for managing the connections and communication between clients. The server is built using the Java Socket API and can handle multiple client connections simultaneously.

The first step in building the server is to create a Server Socket object, which listens for incoming client connections. Once a connection is established, a new thread is spawned to handle the client communication. This allows multiple clients to connect and communicate with the server simultaneously.

The server also maintains a list of all connected clients and their corresponding output streams. This list is used to broadcast messages to all clients in the chatroom. When a client sends a message to the server, the server iterates through the list of output streams and sends the message to each client.


Client-side:

The client-side of the chatroom is responsible for connecting to the server and sending and receiving messages. The client is also built using the Java Socket API and can run on any platform that supports Java.

The first step in building the client is to create a Socket object and connect to the server. Once connected, the client can send messages to the server by writing to the output stream of the socket. The client can also receive messages from the server by reading from the input stream of the socket.

The client also maintains a local thread to receive messages from the server. This thread continuously listens for incoming messages and displays them in the chatroom GUI.

GUI:

The chatroom GUI is built using the Java Swing library. The GUI consists of a text area to display incoming messages, a text field to enter outgoing messages, and a button to send messages to the server.

The GUI also includes a login screen where users can enter their username and connect to the server. Once connected, the user's username is displayed in the chatroom along with all incoming messages.


System Requirements

Hardware requirements:

•	A dedicated server or a cloud -based virtual machine with sufficient processing power and memory to handle multiple client connections simultaneously.
•	At least 2GB of RAM for server , but more may be required depending on the number of concurrent users.
•	A stable internet connection with sufficient bandwidth to support real-time communication between clients and the server.

Software requirements:
•	Java Development Kit (JDK) version 8 or higher.
•	A suitable Integrated Development Environment (IDE) for Java programming, such as IntelliJ IDEA , VS code or NetBeans.
•	A database management system to store user data and chat logs, such as MYSQL or PostgreSQL (not included in this project but may be used in future).
•	A Java Swing library for GUI design of client-side application.

Other considerations:
•	Ensuring that the server’s firewall settings allow incoming connections on the required ports.
•	Implementing security measures such as SSl/TlS encryption for secure communication and user authentication to prevent unauthorized access to the chatroom.

Overall, the system requirement may vary for chatroom with server-client architecture based on its scale and specific requirement.


Conclusion

 In conclusion, the development of a Java program chatroom with a client and server is a challenging task, but it is also a rewarding experience. With the help of the Java Socket API and Swing library, we can create a robust and user-friendly chatroom application. The chatroom can be further improved by implementing features such as file sharing, private messaging, and user authentication.

Future reference

•	The hardware and software requirements for a chatroom with server-client architecture using Java Swing project may change depending on advances in technology and changes in software dependencies. 

•	It's always best to check the latest documentation and guidelines provided by Java Swing and any other relevant libraries or frameworks being used. 

•	Additionally, as the number of concurrent users and data storage requirements increase, you may need to consider upgrading your hardware and software accordingly. This could involve using a more powerful server, increasing memory or storage capacity, or optimizing your code to improve performance. 

•	It's also important to stay up-to-date with security best practices and implement appropriate measures to protect user data and prevent unauthorized access. This could involve using the latest encryption protocols, implementing secure user authentication, and regularly updating your software and libraries to patch any security vulnerabilities.

•	Overall, when developing a chatroom with server-client architecture using Java Swing project or any other technology, it's important to stay flexible and adaptable to changing requirements and advancements in technology.

References

•	Java Swing documentation: https://docs.oracle.com/javase/tutorial/uiswing/
•	IntelliJ IDEA: https://www.jetbrains.com/idea/
•	Secure Sockets Layer (SSL): https://www.ssl.com/faqs/what-is-ssl/
•	Transport Layer Security (TLS): https://www.cloudflare.com/learning/ssl/what-is-tls/





