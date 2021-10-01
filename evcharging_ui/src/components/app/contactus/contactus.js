import React from 'react';
import './contactus.css';



class ContactUs extends React.Component
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
                <h1>YOU CAN REACH TO US BY</h1><hr/>
                </div>
            <div class="container">    
                <h2>Phone number : 9874563211</h2>
                <h2>Email Address : infoway@gmail.com</h2>
                <h2>Resdt. Address : Pune</h2>
            </div><hr/>
            <div class="image">
            <img src="gtr.jpg"></img>
            <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
            </div>
            </div>
            
        </div>    
        );
    }
}

export default ContactUs;
 