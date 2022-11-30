import React from "react";
import Body from "./body";
import { Header } from "./header";

export default function MyCV(props){
    return (
        <div className="w-100 d-flex  flex-column align-items-center">
            <Header></Header>
            <Body></Body>
        </div>
    );
}