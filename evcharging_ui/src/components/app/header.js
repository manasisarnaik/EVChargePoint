import React from 'react';

class Header extends React.Component
{
    constructor(props)
    {
        super(props);
    }
    render()
    {
        console.log("header");
        console.log(this.props);
        var locations = [];
        for (const iterator of this.props.d) 
        {
            console.log(iterator.address.city);
            let added = false;
            for (const iterator1 of locations) 
            {
                if(iterator1==iterator.address.city)
                {
                    added = true;
                }
            }
            if(added==false)
            {
                locations.push(iterator.address.city);
            }
        }
        var vehicles = [];
        for (const iterator of this.props.u.vehicles) 
        {
            console.log(iterator.registration_no);
            let added = false;
            for (const iterator1 of vehicles) 
            {
                if(iterator1==iterator.registration_no)
                {
                    added = true;
                }
            }
            if(added==false)
            {
                vehicles.push(iterator.registration_no);
            }
        }
        return(             
                 <nav className=" navbar navbar-expand-sm bg-dark">
                    <ul className="navbar-nav">
                        <li className="nav-item">
                            <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "home")}>Home</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "aboutus")}>About us</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "contactus")}>Contact Us</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "services")}>Services</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "faq")}>FAQ</a>
                        </li>
                    </ul>
                    <ul className="navbar-nav ml-auto">
                        <li className="nav-item">
                            <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "myvehicles")}>My Vehicles</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "profile")}>Profile</a>
                        </li>
                        <li className="nav-item dropdown">
                            <a className="nav-link dropdown-toggle text-white" href="#" id="navbardrop" data-toggle="dropdown">
                                Pune
                            </a>
                            <div className="dropdown-menu">
                                {locations.map((value) =>{return <a className="dropdown-item" href="#">{value}</a>})}
                            </div>
                        </li>
                        <li className="nav-item dropdown">
                            <a className="nav-link dropdown-toggle text-white" href="#" id="navbardrop" data-toggle="dropdown">
                                Default Vehicle
                            </a>
                            <div className="dropdown-menu">
                                {vehicles.map((value) =>{return <a className="dropdown-item" href="#">{value}</a>})}
                            </div>
                        </li>
                    </ul> 
                </nav>
        );
    }
}

export default Header;