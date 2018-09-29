Customer
- Name
- Phone
- NoOfParty

- Response whether "leave" of Not


Table
- Id
- NumOfSeats
- isAvailable

Restaurant
- customers
- tables

- gets list of available tables
- matches waiting customers (who are in front of the line) with 
  available table (including numbers of party)
- send message to customers
- remove a customer from waiting list
- update table list