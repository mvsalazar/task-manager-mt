import React, { useEffect, useRef, useState } from 'react';
import { AutoGrid, AutoGridRef } from '@vaadin/hilla-react-crud';
import { FamilyEndpoint, FamilyService, UserService } from 'Frontend/generated/endpoints';
import UserModel from 'Frontend/generated/com/taskmanager/model/UserModel';
import { useForm } from '@vaadin/hilla-react-form';
import { FormLayout } from '@vaadin/react-components/FormLayout.js';
import { TextField } from '@vaadin/react-components/TextField.js';

import { Button } from '@vaadin/react-components/Button.js';
import { ComboBox } from '@vaadin/react-components/ComboBox.js'
import FamilyModel from 'Frontend/generated/com/taskmanager/model/FamilyModel';
import UserType from 'Frontend/generated/com/taskmanager/model/UserType';
import Family from 'Frontend/generated/com/taskmanager/model/Family';


export default function HomeView() {
  const autoGrid = useRef<AutoGridRef>(null);
  const {model, field, read, submit} = useForm(UserModel, {
    onSubmit: async (user) => {
      console.log('saving' + JSON.stringify(user));
    }
  });

  const userType = Object.keys(UserType).map((key) => key);
  const [families, setFamilies] = useState<Family[]>([]);

  useEffect(() => {
    FamilyEndpoint.findAll().then(setFamilies);
  }, []);


  return (
    <div className='m-xl'>
      <h1>User</h1>
      <AutoGrid service={UserService} model={UserModel} />
      <h1>Family</h1>
      <AutoGrid service={FamilyService} model={FamilyModel} />
      <FormLayout>
        <TextField label='Name' {...field(model.name)}></TextField>
        <TextField label='Nick Name' {...field(model.nickName)}></TextField>
        <ComboBox label='User Type' items={userType} {...field(model.type)}/>
        <ComboBox label='Family' itemLabelPath='name' itemValuePath='id' items={families} {...field(model.family)}/>
        <Button onClick={submit}>Save</Button>
      </FormLayout>
    </div>
  );
}

