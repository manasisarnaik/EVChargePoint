import React from 'react';
import './faq.css'
class FAQ extends React.Component
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
              <h1>CUSTOMER SUPPORT FAQ</h1>
              </div>
              <hr/>
            <ul>  
              <li><b>I would like to use your network but I have not yet signed up for a plan – can I still 
                charge at an EVgo station?</b></li>
                <ul>
                  <li>
                  Although we encourage EV drivers to become members, either via our free Pay As You Go plan or our low-cost monthly 
                               Membership plan with reduced charging rates, customers can also pay for an individual charging session with a 
                               credit card. Download the EVgo app or contact our 24/7 Customer Support team at (91)86******* to execute a credit 
                               card session.
                  </li>
                </ul>
             </ul>
             <hr/>
             <ul>
               <li><b>
                How do i pay for charging?
               </b></li>
               <ul>
                 <li>1. Open an account with EVgo using a valid credit card to use the EVgo app.<br/>
                            2. Swipe your credit card at the kiosk or on the credit card reader attached to the front of the charger.<br/>
                            3. If there is no credit card reader, call Customer Support at 877-565009 for assistance..
                 </li>           
                </ul> 
             </ul><hr/>
             <ul>
               <li><b>
                 How to I open an account?
               </b> 
               </li>
               <ul>
                 <li>Visit our <a href="header.js">Sign-Up</a> page to view the plans available in your area and to sign up for an account.</li>
               </ul>
               </ul>
               <hr/>
               <ul>
                 <li><b>How much will i have to pay for charging my vehicle?</b></li>
                 <ul>
                   <li>
                   Pricing will depend on the region you charge in and the type of plan selected. Please go to our Sign-Up page 
                               to check out our current EVgo plans in your area.
                   </li>
                 </ul>
               </ul><hr/>
               <ul>
                 <li><b>How do I find an EVgo charging station?</b></li>
                 <ul>
                   <li>
                   You can find all of our public charging stations, along with our partner stations, on our website and in the 
                               CHARGEIT app, via Plugshare, Waze, Goggle and Apple maps.
                            <a href="#"/> Find a Fast Charger Now.
                   </li>
                 </ul>
               </ul><hr/>
               <ul>
                 <li><b>Help! I’m having trouble charging.</b></li>
                 <ul>
                   <li>
                   We strive for an amazing customer experience at each EVgo station; however, should you need to reach us 
                               regarding the functionality of a charger or other problems with your charging session, please contact our 
                               friendly Customer Support team, 24/7, at (91)********.
                   </li>
                 </ul>
               </ul><br/><br/><br/>
               </div>
            </div>
        );
    }
}
export default FAQ;