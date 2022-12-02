<<<<<<< HEAD
atm definition - 
implement solution  for serv card cliets with cards.
Namely:
check balance
print receipt
withdrow cash.

Client should be verify.
verification
blocked if 3 times wrong.


if left card inside, 

solution will deployed at ATM such have different configurations.ATMs(hardware), that contains:
Devices:
monitor,
touchscreen,
cardreader and etc.

ATM abble to communicate woth GBIS by HTTP.
=======
atm definition - implement solutions for serv card clients with cards.
Namely:
check balance
print receipt
withdraw cash.

A client should be verified.
verification
blocked if 3 times wrong.

if a card is left in the card reader, the ATM will take it back in 1 minute.  

the solution will be deployed at ATMs such have different configurations.ATMs(hardware), that contain:
Devices:
monitor,
touchscreen,
card reader and etc.

ATM is able to communicate with GBIS by HTTP.
>>>>>>> d5b358160720ae87a4ea730595894f5bc360078d


Use cases:
1Get Balance
1.1 Input card
1.2 verify card
1.3 Authentification
 
1.4  Show Menu
<<<<<<< HEAD
1.5 Choose get balance item
=======
1.5 Choose get the balance item
>>>>>>> d5b358160720ae87a4ea730595894f5bc360078d
1.6 inquiry balance from GBIS
1.7  show balance
1.8 back  
2Withdrow
2.1 Input...

3Print
3.1 input

Service
1ClientService(rename)
Session start(Card)
void stop(Session)
void reject(Session)
<<<<<<< HEAD
hadle(Command, Session)
=======
handle(Command, Session)
>>>>>>> d5b358160720ae87a4ea730595894f5bc360078d

2CardVerificationService
verify(Card)
3AuthentificationService
validate(Card, Key)

Menu 
MenuRander
rander()

AtmDispatcher
dispatch()
<<<<<<< HEAD








=======
>>>>>>> d5b358160720ae87a4ea730595894f5bc360078d
