import axios from 'axios';
import React from 'react';

class DealerRow extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    verifyDealer = () =>{
        axios.post("http://localhost:8081/dealercont/verifyDealer", 
        {
            id: this.props.dealer.id
        }).then((Response) =>{
            console.log(Response.data);
            if(Response.data==true)
                this.props.getAllDealers(); 
        })
    }

    deleteDealer = () =>{
        axios.post("http://localhost:8081/dealercont/deleteDealer", 
        {
            id: this.props.dealer.id
        }).then((Response) =>{
            console.log(Response.data);
            if(Response.data==true)
                this.props.getAllDealers();
        })
    }

    render()
    {
        var verified = [];
        if(typeof this.props.dealer.start_date !=="undefined")
        {
            verified = <p>Verified</p>;
        }
        else
        {
            verified = <button onClick={this.verifyDealer}>Verify</button>
        }
        return(
            <tr>
                <td>{this.props.dealer.name}</td>
                <td>{this.props.dealer.name + "@gmail.com"}</td>
                <td>{this.props.dealer.mobile_no}</td>
                <td>{this.props.dealer.address.adress1}</td>
                <td>{this.props.dealer.address.city}</td>
                <td>{this.props.dealer.address.pincode}</td>
                <td>{this.props.dealer.address.landmark}</td>
                <td>{this.props.dealer.address.street}</td>
                <td>{verified}</td>
                <td><button onClick={this.deleteDealer} type="button" class="btn btn-danger">Delete</button></td>
            </tr>
        );
    }
}
export default DealerRow;