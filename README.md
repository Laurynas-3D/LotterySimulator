LotterySimulator
- 
This program simulates lottery game based on "Euro Jackpot" lottery in a simplified way. 

#### Program Key Features

- You can buy as many tickets as you like. Default is set 100. Not more than 2,1 billion
- Program shows lottery draw numbers
- Every ticket has unique number, and printed in console
- Program compares all printed ticket numbers with lottery draw numbers
- Program shows statistics (ticket count, how many tickets won, how many euros spent on all tickets, winnings sum)

#### Todo list:
- [x] Correct SonarLint issues. Reported 7 in EuroJackpotApp.java
- [ ] Correct SonarLint issues. Reported 46 in LotteryStatistics.java (45 issues left)
- [ ] Correct SonarLint issues. Reported 17 in EuroJackpotLotteryNumbers.java (16 issues left)
- [ ] Correct SonarLint issues. Reported 54 in euroJackpot.euroJackpot.java (53 issues left)
- [ ] Improve lottery numbers draw algorithm*
- [ ] Calculate winnings based on tickets sold
- [ ] Add feature more features to stats
- [ ] Implement Multithreading

* algorithm * - shuffle all the numbers, randomly pick one, then delete that number from the list, shuffle again and
repeat process again till all required numbers are picked.

---

![game01](https://user-images.githubusercontent.com/46622469/74361244-3de1d200-4dcf-11ea-96a8-4564af8e793a.png)





