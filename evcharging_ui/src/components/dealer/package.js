import React from 'react';
import Packagedetail from './packagedetail';

class Package extends React.Component
{
    constructor(props)
    {
        super(props);
    }
    
    render()
    {
        var packages = [];
        for (const iterator of this.props.slot.packages) 
        {
            packages.push(<Packagedetail package={iterator}/>)
        }
        return(
                    
                        <div className="card">
                            <div class="card text-center">
                                <div className="header1">
                                    <h3>{this.props.slot.type + " - " + this.props.slot.type} </h3>
                                </div><hr/>
                                <table>
                                    <thead>
                                        <th>Price</th>
                                        <th>Unit</th>
                                        <th>Time</th>
                                    </thead>
                                    <tbody>
                                        {packages.map((value)=>{return value})}
                                    </tbody>
                                </table>
                            </div>   
                        </div>
            );
}
}

export default Package;