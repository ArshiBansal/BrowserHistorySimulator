<div align="center">
  <img
    src="https://readme-typing-svg.demolab.com?font=Poppins:ital,wght@1,700&weight=700&size=32&duration=4000&pause=1200&color=00CC88&center=true&vCenter=true&width=900&height=120&multiline=true&repeat=false&lines=Two+stacks.+Zero+remorse.;A+browser+history+simulator+that+actually+gets+it."
    alt="Browser History Simulator Intro"
  />
</div>

<div align="center">
  <b><i>Browser History Simulator.</i></b><br>
  <b><i>The only Java project that makes two stacks feel like they belong in a real browser.</i></b><br><br>
  <b><i>Pushes URLs like it’s still 2005, clears forward history with zero remorse, and timestamps every visit like your browser is keeping receipts.</i></b><br>
  <b><i>Congratulations. You’ve found the only DSA project that actually understands why the back button is a lifestyle.</i></b>
</div>

<br>

<p align="center" style="opacity: 0.7;">• • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • •</p>

<br>

<div align="center">
  <img
    src="https://readme-typing-svg.demolab.com?font=Poppins&size=28&duration=4000&pause=1200&color=00FFA3&center=true&vCenter=true&width=1000&height=120&multiline=true&repeat=false&lines=Problem+Statement%3A+why+does+the+back+button+feel+like+magic%3F"
  />
</div>

Real browsers hide the chaos behind pretty buttons.  
Students get told “just use two stacks” and then stare at the wall.  
Linked lists pretend they’re sophisticated.  
And every tutorial forgets to add timestamps, search, size limits, and actual file persistence.

The world deserved better.  
This is that something.  
You’re welcome.

<p align="center" style="opacity: 0.7;">• • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • •</p>

<br>

<div align="center">
  <img
    src="https://readme-typing-svg.demolab.com?font=Poppins&size=28&duration=4000&pause=1200&color=00CC88&center=true&vCenter=true&width=1000&height=120&multiline=true&repeat=false&lines=Overview%3A+two+stacks+with+main-character+energy"
  />
</div>

Browser History Simulator is a pure Java console app that:

- treats `ArrayDeque` like it’s sacred
- aggressively clears the forward stack the moment you visit something new (real browser energy)
- timestamps every single visit like it’s collecting evidence
- enforces a hard 50-page limit so your RAM doesn’t cry
- lets you search history like you’re trying to find that one tab from three days ago
- saves and loads the entire session so you can close the terminal and pretend nothing happened

<p align="center" style="opacity: 0.7;">• • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • •</p>

<br>

<div align="center">
  <img
    src="https://readme-typing-svg.demolab.com?font=Poppins&size=28&duration=4000&pause=1200&color=00FFA3&center=true&vCenter=true&width=1000&height=140&multiline=true&repeat=false&lines=Features%3A+everything+a+real+browser+history+should+have"
  />
</div>

- Visit any URL (yes, even the cursed ones)
- Go Back / Go Forward with actual stack discipline
- Show current page (for when you forget what tab you’re on)
- Full Back History + Full Forward History
- Clear everything when the shame gets too real
- Hard size limit of 50 pages (oldest ones get the boot)
- Keyword search across the entire history
- Total pages visited counter (judgment included)
- Save / Load history with Java serialization
- Timestamps on every single page (no excuses)

<p align="center" style="opacity: 0.7;">• • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • •</p>

<br>

<div align="center">
  <img
    src="https://readme-typing-svg.demolab.com?font=Poppins&size=28&duration=4000&pause=1200&color=00CC88&center=true&vCenter=true&width=1000&height=120&multiline=true&repeat=false&lines=Data+Structures%3A+the+real+heroes+of+this+story"
  />
</div>

- Two `ArrayDeque`s acting as stacks (`backStack` + `forwardStack`)
- Custom `Page` class holding URL + timestamp
- Object Serialization for save/load
- Hard-coded size limit because memory is not infinite (shocking, I know)

<p align="center" style="opacity: 0.7;">• • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • •</p>

<br>

<div align="center">
  <img
    src="https://readme-typing-svg.demolab.com?font=Poppins&size=28&duration=4000&pause=1200&color=00FFA3&center=true&vCenter=true&width=1000&height=120&multiline=true&repeat=false&lines=How+to+Run%3A+compile+it.+run+it.+feel+something."
  />
</div>

```bash
# From the src folder
javac browserhistory/*.java
java browserhistory.Main
```

That’s it.  
No Maven. No Gradle. No 47 dependencies.  
Just pure Java and two stacks living their best life.

<p align="center" style="opacity: 0.7;">• • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • •</p>

<br>

<div align="center">
  <img
    src="https://readme-typing-svg.demolab.com?font=Poppins&size=28&duration=4000&pause=1200&color=00CC88&center=true&vCenter=true&width=1000&height=120&multiline=true&repeat=false&lines=User+Guide%3A+how+to+abuse+the+back+button+responsibly"
  />
</div>

1. Run the program  
2. Visit a few URLs like you’re doom-scrolling  
3. Spam Back and Forward until you feel something  
4. Search for that one page you swear you visited  
5. Save the session so future-you can judge past-you  
6. Clear history when the evidence becomes too strong  
7. Exit (it auto-saves, because we’re not monsters)

<p align="center" style="opacity: 0.7;">• • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • •</p>

<br>

<div align="center">
  <img
    src="https://readme-typing-svg.demolab.com?font=Poppins&size=28&duration=4000&pause=1200&color=00FFA3&center=true&vCenter=true&width=1000&height=140&multiline=true&repeat=false&lines=Future+Improvements%3A+features+I+might+actually+add+someday"
  />
</div>

- Actual Swing GUI (for people who fear the terminal)
- Unique URL counting (because visiting the same page 47 times is a cry for help)
- Bookmarks (the feature browsers pretend they still care about)
- Export history as CSV so you can spreadsheet your procrastination
- Configurable history size limit
- Dark mode terminal colors (because aesthetics matter)

<p align="center" style="opacity: 0.7;">• • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • •</p>

<br>

<div align="center">
  <img
    src="https://readme-typing-svg.demolab.com?font=Poppins&size=28&duration=4000&pause=1200&color=00CC88&center=true&vCenter=true&width=1000&height=120&multiline=true&repeat=false&lines=Final+Notes%3A+treat+the+stacks+with+respect"
  />
</div>

- This is not a real browser. Obviously.  
- If your history gets too long — blame the size limit, not the code.  
- Two stacks are carrying this entire operation. Treat them with respect.  
- Built because someone had to make a DSA project that doesn’t feel like homework.

<br>

<p align="center" style="opacity: 0.7;">• • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • • •</p>

<br>

<div align="center">
  <img
    src="https://readme-typing-svg.demolab.com?font=Space+Grotesk&weight=700&size=28&duration=4000&pause=1200&color=00FFA3&center=true&vCenter=true&width=1000&height=160&multiline=true&repeat=false&lines=You+reached+the+end.;You+now+officially+understand+why+browsers+use+stacks.;Go+touch+grass...+or+keep+pressing+Back.+No+judgment."
  />
</div>

<br>

## License

This project is open source and available under the **MIT License**.
