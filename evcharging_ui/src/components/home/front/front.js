import React from 'react';
import '../style/front.css'


class Front extends React.Component{
    render()
    {
        return(
        <div>
            <div className="bgimg">
            <div class="container-fluid p-2 my-3 bg-dark text-white">
                    <h1>EV Charge Point</h1>
                    <p class="bg-success text-white">EV station locator & Slot booker</p>
            </div><br/>
            <div class="container-fluid">
                <h3>
                    CHARGE IT ! LETS TAKE A STEP TOWARDS THE FUTURE. TO JOIN WITH US FOR A BETTER TOMORROW.
                    WE ARE APPROACHING TOWARDS SAVING OUR MOTHER EARTH. BE A PART OF OUR TEAM. SWITCH TO ELECTRIC VEHICLE
                    AND JOIN OUR TEAM FOR A BETTER CAUSE!
                </h3><hr/>
            </div><br/><br/>
            <div>
                <h1>MAKE YOUR EV CHARGING EASY WITH FEW STEPS</h1>
            </div>
            <br/><br/><br/>
            <div class="card-deck">
                <div class="card bg-success" style={{height:"auto"}}>
                    <div class="card-body text-center">
                    <div className="text">
                        <h2>Select Your Charge Point</h2>
                    </div>    
                    <br/>
                    <li class="card-text text-left" >Register/Login first</li><br/>
                    <li class="card-text text-left">Search Charge Station by your PinCode</li><br/>
                    <li class="card-text text-left">Select near by Charge Station</li><br/>
                    <li class="card-text text-left">Go for booking</li>
                </div>
            </div>
            
            
                <div class="card bg-success" style={{height:"auto"}}>
                    <div class="card-body text-center">
                     <div className="text">   
                        <h2>Select EV Category</h2>
                     </div>
                    <br/>
                    <li class="card-text text-left">Select the type of you EV</li><br/>
                    <li class="card-text text-left">All types for charge are available</li><br/>
                    <li class="card-text text-left">Fast Charge/DC/AC all ouput types</li><br/>
                    <li class="card-text text-left">For Slot Timing go to next page</li>
                </div>
            </div>
            
            
                <div class="card bg-success" style={{height:"auto"}}>
                    <div class="card-body text-center">
                    <div className="text">
                        <h2>Book Your Slot</h2>
                    </div>
                    <br/>
                    <li class="card-text text-left">Check for available time slot</li><br/>
                    <li class="card-text text-left">Select available time slot</li><br/>
                    <li class="card-text text-left">Fill required fields</li><br/>
                    <li class="card-text text-left">Proceed for payment</li>
                </div>
            
            </div>
           
                <div class="card bg-success" style={{height:"auto"}}>
                    <div class="card-body text-center">
                    <div className="text">
                        <h2>Make Payment</h2>
                        </div>
                    <br/>
                    <li class="card-text text-left">Payment by easy methods mentioned below</li><br/>
                    <li class="card-text text-left">Cash Payment</li><br/>
                    <li class="card-text text-left">Credit/Debit cards (Coming Soon)</li><br/>
                    <li class="card-text text-left">FasTag (Coming Soon) </li>
                </div>
            
            </div>
        </div><br/><br/><br/><br/><br/><br/><br/><br/><br/>
            <div class="footer">
                <h5>EV Charge Point Pvt. Ltd.</h5>
                <h6>Baner,Pune(411045)</h6>
                <h6>9874563211</h6>
            </div>
            </div>
        </div>
        );
    }
}

export default Front;