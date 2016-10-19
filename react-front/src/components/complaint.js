import React, { Component } from 'react';
import {Form, FormGroup, ControlLabel, FormControl, HelpBlock  } from 'react-bootstrap';


class Complaint extends Component {

  constructor(){
    super();
    this.state = {text:'',title:'',photo:'',authorId:''};
  }

   getValidationState() {
    const length = this.state.text.length;
    if (length > 10) return 'success';
    else if (length > 5) return 'warning';
    else if (length > 0) return 'error';
  }

  handleChange = function(e) {
      console.log(e);
     this.setState({ text: e.target.value });
  }

  handleChangeTitle = function(e) {
      console.log(e);
     this.setState({ title: e.target.value });
  }

  render() {
    return (
        <Form horizontal>
          <FormGroup controlId="formBasicText">
            <ControlLabel>Title</ControlLabel>
            <FormControl type="text" value={this.state.title} placeholder="Enter title" onChange={this.handleChangeTitle.bind(this)}/>
            <FormControl.Feedback />
          </FormGroup>
          
          <FormGroup controlId="formBasicText" validationState={this.getValidationState()}>
             <ControlLabel>Text</ControlLabel>
            <FormControl type="text" value={this.state.text} placeholder="Enter text" onChange={this.handleChange.bind(this)}/>
            <FormControl.Feedback />
            <HelpBlock>Validation is based on string length.</HelpBlock>
          </FormGroup>

        </Form>
    );
  }
}

export default Complaint;
