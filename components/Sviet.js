//App.js
import './App.css';
import Intro from './intro.js';
function App() {
  return (
    <div className="App">
      {<header className="App-header">
        <img src={"https://www.sviet.edu.in/wp-content/uploads/2023/06/SVIET-LOGO-Edited-1.png"} className="App-logo" alt="logo" />
        <p>
          Sri Vasavi Institute Of Engineering And Technology
        </p>
        <a
          className="App-link"
          href="https://www.sviet.edu.in/"
          target="_blank"
          rel="noopener noreferrer"
        >
          SVIET
        </a>
        <Intro/>
        </header>}
    </div>
  );
}
export default App;
 

//Intro.js
function Intro()
{
return(
    <div>
        <h1>Welcome to reactjs sesions</h1>
    </div>
);
}
export default Intro;