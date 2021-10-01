import React from 'react';
import ContactUs from './contactus/contactus';
import Services from './services/services';
import Home from './home/home';
import AboutUs from './aboutus/aboutus';
import Book from './home/book';
import MyVehicles from './myvehicles/myvehicles';
import Profile from './profile/profile';
import FAQ from './faq/faq';




class Body extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        console.log(this.props.menu);
        switch (this.props.menu) 
        {
            case "contactus": 
                return(
                    <div>
                        <ContactUs u={this.props.u} b={this.props.b} d={this.props.d} view={this.props.view}/>
                    </div>
                );     
            case "services":
                return(
                    <div>
                        <Services u={this.props.u} b={this.props.b} d={this.props.d} view={this.props.view}/>
                    </div>
                ); 
            case "home":
                return(
                    <div>
                        <Home u={this.props.u} b={this.props.b} d={this.props.d} switchMenu={this.props.switchMenu} view={this.props.view}/>
                    </div>
                ); 
            case "aboutus":
                return(
                    <div>
                        <AboutUs u={this.props.u} b={this.props.b} d={this.props.d} view={this.props.view}/>
                    </div>
                );
                case "faq":
                return(
                    <div>
                        <FAQ u={this.props.u} b={this.props.b} d={this.props.d} view={this.props.view}/>
                    </div>
                );
                case "book":
                return(
                    <div>
                        <Book u={this.props.u} b={this.props.b} d={this.props.d} view={this.props.view}/>
                    </div>
                ); 
            case "myvehicles":
                return(
                    <div>
                        <MyVehicles u={this.props.u} b={this.props.b} d={this.props.d} view={this.props.view}/>
                    </div>
                ); 
            case "profile":  
                return(
                    <div>
                        <Profile u={this.props.u} b={this.props.b} d={this.props.d} view={this.props.view}/>
                    </div>
                ); 
            
            default:
                return(
                    <div>
                        <Home u={this.props.u} b={this.props.b} d={this.props.d} view={this.props.view}/>
                    </div>
                ); 
        }
    }
}
export default Body;