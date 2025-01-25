import React from 'react';
import { AutoGrid } from '@vaadin/hilla-react-crud';
import { UserService } from 'Frontend/generated/endpoints';
import UserModel from 'Frontend/generated/com/taskmanager/model/UserModel';

export default function HomeView() {
  return (
    <div className='p-1'>
      <AutoGrid service={UserService} model={UserModel} />
    </div>
  );
}

