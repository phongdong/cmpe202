Explanation:
------------------------------

- State pattern is chosen for Table object to update its status.
- Observer pattern is chosen for Restaurant object in my design because there is one-to-many relationship between Restaurant Object and Customer Object, one-to-many relationship between Restaurant Object and Table Object. Whenever Customer or Table Object is modified, Restaurent will be notified automatically.




Objects
------------------------------

Customer
- Name
- Phone
- NoOfParty

- responses whether "leave" of Not


Table
- Id
- NumOfSeats
- isAvailable

- updates state


Restaurant
- customers
- tables

- gets list of available tables
- matches waiting customers (who are in front of the line) with 
  available table (including numbers of party)
- send message to customers
- remove a customer from waiting list
- update table list