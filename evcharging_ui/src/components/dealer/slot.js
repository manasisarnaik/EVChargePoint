import axios from 'axios';
import React from 'react';
import Package from './package';

class Brands extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state = {d: [], status: "null"};
        this.getDealer();
    }

    getDealer = () =>{
        axios.post("http://localhost:8081/dealercont/getDealer", 
        {
            id: this.props.id
        }).then((Response) =>{
            console.log(Response.data);
                this.setState({d: Response.data}, () => {this.setState({status: "done"})});
        })
    }
    

    render()
    { 
        if(this.state.status=="done")
        {
            var slots = [];
            for (const iterator of this.state.d.slots) 
            {
                slots.push(<Package slot={iterator}/>)
            }
            return (
                <div className="container-fluid">
                    {slots.map((value) =>{return value})}
                </div>
                );

        }
        else
        {
            return <div> </div>;
        }
        
    }
}
    export default Brands;