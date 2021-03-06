/*
 * jFCPlib - PeerNoteTest.java - Copyright © 2015–2016 David Roden
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.pterodactylus.fcp;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

/**
 * Unit test for {@link PeerNote}.
 *
 * @author <a href="mailto:bombe@pterodactylus.net">David ‘Bombe’ Roden</a>
 */
public class PeerNoteTest {

	@Test
	public void peerNoteIsDecodedCorrectly() {
		FcpMessage receivedMessage = new FcpMessage("PeerNote");
		receivedMessage.setField("NoteText", "VWJlck5vZGUgKHVudGlsIEkgaGF2ZSByZWFsIHBlZXJzKQ==");
		PeerNote peerNote = new PeerNote(receivedMessage);
		assertThat(peerNote.getNoteText(), is("UberNode (until I have real peers)"));
	}

}
