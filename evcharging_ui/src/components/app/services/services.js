import React from 'react';
import './services.css'
class Services extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        return(
            <div>
                <div className="bgimg">
                <div class="header">
                <h2><b>SERVICES</b></h2><hr/>
                </div>
            <div className="EV">    
            <h3>EV Charging Simplified</h3>
            </div>
        <div class="body">
            <h4>Stations:</h4>
                Chargeway® displays your EV charging options. No filtering or having to 
                learn any engineering. Just enter your vehicle info and drive with confidence.<br/>

                <h4>Timer:</h4>
                Chargeway® helps you fit charging into your daily life. Select your current 
                range and choose a power level to see your estimated charging time.
            <br/><br/><br/><br/><br/><br/>
            <div class="footer">
                <h3>IF YOU HAVE QUESTIONS, LET US KNOW!</h3>
                </div>
                <div class="footer1">
                <a href="contactus.js"><b>Contact US</b></a>
                </div>
              </div> 
            </div>
        </div>    
        );
    }
}
export default Services;