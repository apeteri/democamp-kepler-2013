/*
 * Copyright (c) 2004 - 2012 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package rcpmail.server;

import org.eclipse.emf.cdo.CDOState;
import org.eclipse.emf.cdo.common.id.CDOIDUtil;

import rcpmail.model.Message;

/**
 * @author  Eike Stepper
 */
public class MessageEvent
{
  private final String from;

  private final String subject;

  private final String body;

  private final long uid;

  private final boolean deleted;

  public MessageEvent(Message message)
  {
    from = message.getFrom();
    subject = message.getSubject();
    body = message.getBody();
    uid = CDOIDUtil.getLong(message.cdoID());
    deleted = CDOState.TRANSIENT == message.cdoState();
  }

  public String getFrom()
  {
    return from;
  }

  public String getSubject()
  {
    return subject;
  }

  public String getBody()
  {
    return body;
  }

  public long getUid()
  {
    return uid;
  }

  public boolean isDeleted()
  {
    return deleted;
  }
}
