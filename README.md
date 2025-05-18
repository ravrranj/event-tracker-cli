# Event Tracker CLI

A simple command-line interface (CLI) tool to track events with timestamps.

## Features

- Add events with current timestamp
- Show all recorded events
- Clear all events
- Exit the tracker anytime
- Help menu for quick command reference

## Usage

Run the program and use the following commands:

- `add <event_name>` — Adds an event with the current system timestamp  
- `show` — Displays all recorded events  
- `clear` — Clears all events from the tracker  
- `exit` — Exits the tracker program  
- `help` — Displays this help menu  

💻 Example:

? Event tracker CLI started. Type 'help' for options.

add Meeting
? Event added: Meeting
show
? Events:

[Mon May 19 12:00:00 IST 2025] Meeting

clear
? All events cleared.
exit
👋 Exiting tracker. Goodbye!!


## Next Steps

- Integrate with Spring Boot and Redis for persistence and scalability  
- Add user authentication and multi-user support  
- Build a web or mobile frontend interface  


