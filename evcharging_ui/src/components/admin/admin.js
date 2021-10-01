import axios from 'axios';
import React from 'react';
import DealerRow from './dealerrow';
import './admin.css'


class Admin extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state = {dealers: []};
        this.getAllDealers();
    }

    getAllDealers = () =>{
            axios.get("http://localhost:8081/dealers").then((Response) => {
                console.log(Response.data);
                this.setState({dealers: Response.data});
            });
    }

    render()
    {
        // console.log(this.props);
        var dis =[];
        for (const iterator of this.state.dealers) 
        {
            dis.push(<DealerRow dealer={iterator} getAllDealers={this.getAllDealers}/>)            
        }
        return(
            <div>
                <div className="bgimg">
                <div class="container-fluid">
                    <h2 class="bg-success text-white">
                        ADMIN VIEW
                    </h2><br/>
                    <table class="table table-hover table-bordered">
                            <thead>
                                <tr>
                                    <th>Dealers Name</th>
                                    <th>Dealers Email</th>
                                    <th>Dealers Mobile No</th>
                                    <th>Dealers Address</th>
                                    <th>Dealers City</th>
                                    <th>Dealers Pincode</th>
                                    <th>Landmark</th>
                                    <th>Street</th>
                                    <th>Verify Dealer</th>
                                    <th>Delete Dealer</th>
                                </tr>
                            </thead> 
                            <tbody>
                                {
                                    dis.map((value) =>{return value})
                                }
                            </tbody>  
                            
                        </table>
                    </div>
                </div>     
            </div>
        );
    }
}
export default Admin;